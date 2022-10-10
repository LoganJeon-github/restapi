## POST
- 1. Create table 
  - /{tableName}
  - url에 테이블명 정의.
  - JSON Body에 column을 정의.
    - column type을 정하지 않을 시 자동으로 varchar 타입으로 정의.
```JSON
{
    "columns":[
        {
            "name" : "col1",
            "type": "int"
        },
        {
            "name":"col2",
            "type":"string"
        },
        {
            "name": "col3"
        }
    ]
}
```
