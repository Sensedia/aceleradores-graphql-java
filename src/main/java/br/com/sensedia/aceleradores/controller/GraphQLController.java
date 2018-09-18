package br.com.sensedia.aceleradores.controller;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.execution.instrumentation.tracing.TracingInstrumentation;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
import java.util.Map;

@RestController
public class GraphQLController {

    @RequestMapping(method = RequestMethod.POST, path = "/graphql")
    public Map<String,Object> graphql(@RequestBody String request) throws Exception {

        JSONObject jsonRequest = new JSONObject (request);

        SchemaParser schemaParser = new SchemaParser();
        File schemaFile = new File("resources/schema.graphqls");

        TypeDefinitionRegistry typeDefinitionRegistry = schemaParser.parse(schemaFile);

        SchemaGenerator schemaGenerator = new SchemaGenerator();
        GraphQLSchema graphQLSchema = schemaGenerator.makeExecutableSchema(typeDefinitionRegistry, null);
        GraphQL build = GraphQL.newGraphQL(graphQLSchema).instrumentation(new TracingInstrumentation()).build();

        ExecutionInput executionInput = ExecutionInput.newExecutionInput().query(jsonRequest.getString("query")).build();
        ExecutionResult executionResult = build.execute(executionInput);

        return executionResult.toSpecification();
    }

}
