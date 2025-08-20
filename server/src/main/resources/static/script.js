const customerForm = document.getElementById("customerForm");
const customerInfoSection = document.getElementById("customer-info");
const eventsSection = document.getElementById("events-section");

// No need for http://localhost:8080 anymore, just use relative paths
const BASE_URL = "http://localhost:8080";

customerForm.addEventListener("submit", async (e) => {
  e.preventDefault();

  const customerData = {
    firstName: document.getElementById("firstName").value,
    lastName: document.getElementById("lastName").value,
    age: parseInt(document.getElementById("age").value),
    email: document.getElementById("email").value,
  };

  try {
    // POST customer data to backend
    await fetch(`${BASE_URL}/customers`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(customerData),
    });

    // Show back to user
    document.getElementById("displayName").textContent =
      `${customerData.firstName} ${customerData.lastName}`;
    document.getElementById("displayAge").textContent = customerData.age;
    document.getElementById("displayEmail").textContent = customerData.email;

    customerInfoSection.classList.remove("hidden");

    // Fetch and display events
    fetchEvents();
  } catch (err) {
    alert("Error saving customer: " + err.message);
  }
});

async function fetchEvents() {
  try {
    const response = await fetch(`${BASE_URL}/events`);
    const events = await response.json();

    const eventsTableBody = document.getElementById("eventsTableBody");
    eventsTableBody.innerHTML = "";

    events.forEach(event => {
      const row = document.createElement("tr");
      row.innerHTML = `
        <td>${event.id}</td>
        <td>${event.name}</td>
        <td>${event.venue}</td>
        <td>${event.date}</td>
        <td>${event.numTicketsAvailable}</td>
        <td>${event.artistName}</td>
      `;
      eventsTableBody.appendChild(row);
    });

    eventsSection.classList.remove("hidden");
  } catch (err) {
    alert("Error fetching events: " + err.message);
  }
}
