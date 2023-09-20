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

-----------

# Candidate-Service

```
http://localhost:8080/candidate/all
```

Response:

```json
[
    {
        "id": "1",
        "name": "sam",
        "skills": [
            "java",
            "spring"
        ],
        "hostName": "3eb879df14f9"
    },
    {
        "id": "2",
        "name": "jake",
        "skills": [
            "docker"
        ],
        "hostName": "3eb879df14f9"
    },
    {
        "id": "3",
        "name": "mike",
        "skills": [
            "jira"
        ],
        "hostName": "3eb879df14f9"
    }
]
```

```
http://localhost:8080/candidate/2
```

```json
{
    "id": "2",
    "name": "jake",
    "skills": [
        "docker"
    ],
    "hostName": "3eb879df14f9",
    "recommendedJobs": []
}
```
