INSERT INTO author (author_id, full_name)
VALUES(10001, 'Chetan Bhagat');

INSERT INTO author (author_id, full_name)
VALUES(10002, 'Dan Brown');

INSERT INTO author (author_id, full_name)
VALUES(10003, 'J K Rowling');

INSERT INTO author (author_id, full_name)
VALUES(10004, 'Blake Crouch');

INSERT INTO author (author_id, full_name)
VALUES(10005, 'Frederick Bachman');

Insert into genre (genre_id, genre_name)
values(1, 'Thriller');

Insert into genre (genre_id, genre_name)
values(2, 'Fantasy');

Insert into genre (genre_id, genre_name)
values(3, 'Sci-Fi');

Insert into genre (genre_id, genre_name)
values(4, 'Literature');

Insert into book (book_id, title, description, rating, author_author_id,
genre_genre_id, price)
values(1, 'Harry Potter And The Philosopher Stone', 'Best Book', 4, 10003, 2,
200);

Insert into book (book_id, title, description, rating, author_author_id,
genre_genre_id, price)
values(2, 'Harry Potter And The Chamber of Secrets', 'Best Book Two', 4.1,
10003, 2,
 300
);

Insert into book (book_id, title, description, rating, author_author_id,
genre_genre_id, price)
values(3, 'BearTown', 'An Ice Hockey Small Town', 4.3, 10005, 4, 450);