-- Problem: User Activity for the Past 30 Days I

-- Starting Date to End Date (2019-06-28 to 2019-07-27)... So remove last two entries in given table, because these date do not come in this range...

SELECT activity_date as day, COUNT(DISTINCT user_id) as active_users 
FROM Activity 
WHERE activity_date >= '2019-06-28' AND activity_date <= '2019-07-27'
GROUP by activity_date
