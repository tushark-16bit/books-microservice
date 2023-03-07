INSERT
    INTO
        author(
            author_id,
            full_name
        )
    VALUES(
        10001,
        'Chetan Bhagat'
    );

INSERT
    INTO
        author(
            author_id,
            full_name
        )
    VALUES(
        10002,
        'Dan Brown'
    );

INSERT
    INTO
        author(
            author_id,
            full_name
        )
    VALUES(
        10003,
        'J K Rowling'
    );

INSERT
    INTO
        author(
            author_id,
            full_name
        )
    VALUES(
        10004,
        'Blake Crouch'
    );

INSERT
    INTO
        author(
            author_id,
            full_name
        )
    VALUES(
        10005,
        'Frederick Bachman'
    );

INSERT
    INTO
        genre(
            genre_id,
            genre_name
        )
    VALUES(
        20001,
        'Thriller'
    );

INSERT
    INTO
        genre(
            genre_id,
            genre_name
        )
    VALUES(
        20002,
        'Fantasy'
    );

INSERT
    INTO
        genre(
            genre_id,
            genre_name
        )
    VALUES(
        20003,
        'Sci-Fi'
    );

INSERT
    INTO
        genre(
            genre_id,
            genre_name
        )
    VALUES(
        20004,
        'Literature'
    );

INSERT
    INTO
        book(
            book_id,
            title,
            description,
            rating,
            author_id,
            genre_id,
            price
        )
    VALUES(
        30001,
        'Harry Potter And The Philosopher Stone',
        'Best Book',
        4,
        10003,
        20002,
        200
    );

INSERT
    INTO
        book(
            book_id,
            title,
            description,
            rating,
            author_id,
            genre_id,
            price
        )
    VALUES(
        30002,
        'Harry Potter And The Chamber of Secrets',
        'Best Book Two',
        4.1,
        10003,
        20002,
        300
    );

INSERT
    INTO
        book(
            book_id,
            title,
            description,
            rating,
            author_id,
            genre_id,
            price
        )
    VALUES(
        30003,
        'BearTown',
        'An Ice Hockey Small Town',
        4.3,
        10005,
        20004,
        450
    );