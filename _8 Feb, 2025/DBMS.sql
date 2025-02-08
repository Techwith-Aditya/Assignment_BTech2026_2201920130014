-- Problem: Exchange Seats

SELECT
    CASE
        WHEN 
            id=(SELECT MAX(id) FROM Seat) AND MOD(id, 2)=1 -- Jb no of id's odd hogi tb last wali  id as it is rhegi...
            THEN id
        WHEN
            MOD(id, 2)=1 -- mtlb vo id odd h...
            THEN id+1
        ELSE -- jb id number even h to usko ek id upr lana h...
            id-1
    END AS id, student
FROM Seat
ORDER BY id
