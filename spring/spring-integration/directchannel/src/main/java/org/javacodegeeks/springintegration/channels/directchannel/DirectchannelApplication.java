package org.javacodegeeks.channels.directchannel;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

import org.javacodegeeks.springintegration.channels.directchannel.model.Book;
import org.javacodegeeks.springintegration.channels.directchannel.incoming.BookPublisher;
import org.javacodegeeks.springintegration.channels.directchannel.pub.Librarian;
import org.javacodegeeks.springintegration.channels.directchannel.sub.PremiumReader;

@SpringBootApplication
@ComponentScan(basePackages = "org.javacodegeeks.springintegration.channels.directchannel")
public class DirectchannelApplication {

    @Autowired
    private BookPublisher bookPublisher;
    
    @Autowired
    private Librarian librarian;
    
    @Autowired
    private DirectChannel library;
      
    @Bean
    public MessageChannel bookChannel() {
        return new DirectChannel();
    }
    
	public static void main(String[] args) {
		SpringApplication.run(DirectchannelApplication.class, args);
	}
	
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            library.subscribe(new PremiumReader());
            library.subscribe(new PremiumReader());
            library.subscribe(new PremiumReader());
            
		    List<Book> books = bookPublisher.getBooks();  

            for (Book book : books) {
                librarian.sendPremiumReaders(book);
            }
	    };
    }
}
