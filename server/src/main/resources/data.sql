insert into customer (FIRST_NAME, LAST_NAME, AGE, EMAIL)
values
    ('Steven', 'Johnson', 45, 'steven@gmail.com'),
    ('Bob', 'Stevenson', 14, 'bob@gmail.com');

insert into event (NAME, VENUE, DATE, ARTIST_NAME, NUM_TICKETS_AVAILABLE)
values
    ('PWR UP Tour', 'Hockenheimring', '13-07-2024', 'AC/DC', 100000),
    ('Eras Tour', 'Warsaw', '01-09-2025', 'Taylor Swift', 75000),
    ('Farewell Tour', 'Leipzig', '09-07-2026', 'KISS', 24000),
    ('Pitbull World Tour', 'Krakow', '25-06-2026', 'Pitbull', 1200);

insert into ticket (EVENT, TICKET_HOLDER, PRICE, SEAT_TYPE)
values
        (1, 1, 250, 'general admission'),
        (3, 1, 500, 'sector c seat 4'),
        (2, 2, 100, 'front of stage'),
        (4, 1, 50, 'sector d seat 12');