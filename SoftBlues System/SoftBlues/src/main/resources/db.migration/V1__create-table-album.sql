CREATE TABLE album (
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    albumName TEXT NOT NULL,
    albumName TEXT NOT NULL,
    songs TEXT NOT NULL,
    artist TEXT NOT NULL,
    yearLaunch TEXT NOT NULL,
    albumLength TEXT NOT NULL,
    isSaved BIT NOT NULL
);