select ID, LENGTH from FISH_INFO
order by IFNULL(LENGTH, 10) desc, ID
LIMIT 10
