# Spring Cloud Function Sample

## Steps

- clone the [spring-cloud-function-sample](https://github.com/rahulmlokurte/aws-sam-examples/tree/main/spring-cloud-function-sample) repository

- The VS code launch.json setup is as shown [here](https://github.com/rahulmlokurte/aws-sam-examples/blob/main/spring-cloud-function-sample/.vscode/launch.json)

```json
{
    "configurations": [
        {
            "type": "aws-sam",
            "request": "direct-invoke",
            "name": "spring-cloud-function-sample:AdditionFunction",
            "invokeTarget": {
                "target": "template",
                "templatePath": "${workspaceFolder}/template.yaml",
                "logicalId": "AdditionFunction"
            },
            "lambda": {
                "payload": {
                    "path": "events/event.json"
                },
                "environmentVariables": {}
            }
        }
    ]
}
```

- As you see from above launch.json, the input to AWS lambda function is stored at lambda.payload.path value.(events/event.json)

- Run the application