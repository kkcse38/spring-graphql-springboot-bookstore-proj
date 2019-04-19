package com.java.demo.graphqlbookproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.java.demo.graphqlbookproject.controller.modal.Author;
import com.java.demo.graphqlbookproject.controller.modal.Book;
import com.java.demo.graphqlbookproject.dao.AuthorRepository;
import com.java.demo.graphqlbookproject.dao.BookRepository;
import com.java.demo.graphqlbookproject.service.BookResolver;
import com.java.demo.graphqlbookproject.service.*;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaParser;

@SpringBootApplication
public class GraphqlBookProjectApplication {
	
//	@Autowired
//	BookRepository bookRepository;
//	
//	@Autowired
//	AuthorRepository authorRepository;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlBookProjectApplication.class, args);
	}

//	@Bean
//	public BookResolver authorResolver(AuthorRepository authorRepository) {
//		return new BookResolver(authorRepository);
//	}
//	
//	@Bean
//	public Query query(BookRepository bookRepository) {
//		return new Query(bookRepository);
//	}

//	@Bean
//	public CommandLineRunner demo(AuthorRepository authorRepository, BookRepository bookRepository) {
//		return (args) -> {
//			Author author = new Author("Herbert", "Schildt");
//			authorRepository.save(author);
//			
//			bookRepository.save(new Book("Math","200",1));
//		};
//	}
	
//	@Bean
//    public GraphQL graphQL(BookResolver blogPostService) {
//
//        GraphQLSchema schema = new GraphQLSchemaGenerator()
//                .withResolverBuilders(
//                        new AnnotatedResolverBuilder(),
//                        new PublicResolverBuilder("com.arturskrzydlo.graphqldemo"))
//                .withOperationsFromSingleton(blogPostService)
//                .withValueMapperFactory(new JacksonValueMapperFactory())
//                .generate();
//        return GraphQL.newGraphQL(schema)
//                .queryExecutionStrategy(new BatchedExecutionStrategy())
//                .instrumentation(new ChainedInstrumentation(Arrays.asList(
//                        new MaxQueryComplexityInstrumentation(200),
//                        new MaxQueryDepthInstrumentation(20)
//                )))
//                .build();
//    }
	
	
	
}

