# parking-api

Example d'utilisation : 


curl --location --request POST 'http://localhost:8080/parking/printBill' \
--header 'Content-Type: application/json' \
--data-raw '{

    "car": "voitre",
    "entryDate": 1593684601000,
    "leavingDate": 1593692401000,
    "isBike": false,
    "isGPL": true
}'
