# Job-Service

```
GET: http://localhost:8080/job/all
```

```
curl --location 'http://localhost:8080/job' \
--header 'Content-Type: application/json' \
--data '{
    "description": "staff developer",
    "company": "apple",
    "skills": [
        "javascript",
        "reactjs"
    ],
    "salary": 90000,
    "remote": false
}'
```

```
http://localhost:8080/job/search?skills=project
```
