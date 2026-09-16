Hashing:
--------
->It is a technique used in data structues that efficiently stores and retreive data
->Hashing is only used to implement a set of distinct items and dictionaries (Key value pairs)

The main idea:
--------------
    key->hash function->index->stror/find data

Hash Function:
--------------
    index=key%tablesize

ex:
A=[10,25,37,42,55,63]
10->25->37->42->55


Hash Table:
 
 index    Value
    0      10->null
    1      null
    2      42->null
    3      null
    4      null
    5      25->55->null
    6      null
    7      37->null
    8      null
    9      null