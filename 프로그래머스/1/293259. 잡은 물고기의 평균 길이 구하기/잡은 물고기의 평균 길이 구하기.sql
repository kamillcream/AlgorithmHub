SELECT
    ROUND(
        AVG(
            CASE
                WHEN COALESCE(LENGTH, 10) <= 10 THEN 10
                ELSE LENGTH
            END
        ),
        2
    ) AS AVERAGE_LENGTH
FROM FISH_INFO;