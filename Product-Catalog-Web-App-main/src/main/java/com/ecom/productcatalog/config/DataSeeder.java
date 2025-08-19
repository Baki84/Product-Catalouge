package com.ecom.productcatalog.config;

import java.util.Arrays;


import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner {

  private final ProductRepository productRepository;
  private final CategoryRepository categoryRepository;

  public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
    this.productRepository = productRepository;
    this.categoryRepository = categoryRepository;
  }

  @Override
  public void run(String... args) throws Exception {

    // clear all existing data
    productRepository.deleteAll();
    categoryRepository.deleteAll();

    // Create Categories
    Category electronics = new Category();
    electronics.setName("Electronics");

    Category clothing = new Category();
    clothing.setName("Clothing");

    Category home = new Category();
    home.setName("Home and kitchen");

    Category beauty = new Category();
    beauty.setName("Beauty & Personal Care");

    Category sports = new Category();
    sports.setName("Sports and Outdoors");

    Category toys = new Category();
    toys.setName("Toys & Games");

    Category books = new Category();
    books.setName("Books");

    categoryRepository.saveAll(Arrays.asList(electronics, clothing, home, beauty, sports, toys, books));

    // Create Products
    Product phone = new Product();
    phone.setName("SmartPhone");
    phone.setDescription("Latest model smartphone with amazing features");
    phone.setImageUrl("https://placehold.co/600x400");
    phone.setPrice(699.99);
    phone.setCategory(electronics);

    Product laptop = new Product();
    laptop.setName("Laptop");
    laptop.setDescription("High performance laptop for work and play.");
    laptop.setImageUrl("https://placehold.co/600x400");
    laptop.setPrice(999.99);
    laptop.setCategory(electronics);

    Product jacket = new Product();
    jacket.setName("Winter Jacket");
    jacket.setDescription("Warm and cozy jacket for winter.");
    jacket.setImageUrl("https://placehold.co/600x400");
    jacket.setPrice(129.99);
    jacket.setCategory(clothing);

    Product blender = new Product();
    blender.setName("Blender");
    blender.setDescription("High-speed blender for smoothies and more.");
    blender.setImageUrl("https://placehold.co/600x400");
    blender.setPrice(89.99);
    blender.setCategory(home);

    Product lipstick = new Product();
    lipstick.setName("Matte Lipstick");
    lipstick.setDescription("Long-lasting matte lipstick in various shades.");
    lipstick.setImageUrl("https://placehold.co/600x400");
    lipstick.setPrice(19.99);
    lipstick.setCategory(beauty);

    Product foundation = new Product();
    foundation.setName("Liquid Foundation");
    foundation.setDescription("Full coverage foundation for a flawless finish.");
    foundation.setImageUrl("https://placehold.co/600x400");
    foundation.setPrice(24.99);
    foundation.setCategory(beauty);

    Product mascara = new Product();
    mascara.setName("Waterproof Mascara");
    mascara.setDescription("Smudge-proof and waterproof mascara for voluminous lashes.");
    mascara.setImageUrl("https://placehold.co/600x400");
    mascara.setPrice(14.99);
    mascara.setCategory(beauty);

    Product eyeshadowPalette = new Product();
    eyeshadowPalette.setName("Eyeshadow Palette");
    eyeshadowPalette.setDescription("Includes a variety of colors for every occasion.");
    eyeshadowPalette.setImageUrl("https://placehold.co/600x400");
    eyeshadowPalette.setPrice(29.99);
    eyeshadowPalette.setCategory(beauty);

    Product sofa = new Product();
    sofa.setName("3-Seater Sofa");
    sofa.setDescription("Comfortable and stylish sofa for your living room.");
    sofa.setImageUrl("https://placehold.co/600x400");
    sofa.setPrice(699.99);
    sofa.setCategory(home);

    Product bike = new Product();
    bike.setName("Mountain Bike");
    bike.setDescription("Durable bike for off-road trails and city rides.");
    bike.setImageUrl("https://placehold.co/600x400");
    bike.setPrice(299.99);
    bike.setCategory(sports);

    Product teddyBear = new Product();
    teddyBear.setName("Teddy Bear");
    teddyBear.setDescription("Soft and cuddly teddy bear for kids.");
    teddyBear.setImageUrl("https://placehold.co/600x400");
    teddyBear.setPrice(24.99);
    teddyBear.setCategory(toys);

    Product puzzle = new Product();
    puzzle.setName("500-piece Puzzle");
    puzzle.setDescription("Challenging puzzle for hours of entertainment.");
    puzzle.setImageUrl("https://placehold.co/600x400");
    puzzle.setPrice(14.99);
    puzzle.setCategory(toys);

    Product boardGame = new Product();
    boardGame.setName("Board Game");
    boardGame.setDescription("Fun family board game for all ages.");
    boardGame.setImageUrl("https://placehold.co/600x400");
    boardGame.setPrice(39.99);
    boardGame.setCategory(toys);

    Product fictionBook = new Product();
    fictionBook.setName("The Great Adventure");
    fictionBook.setDescription("A thrilling fiction novel that keeps you on the edge of your seat.");
    fictionBook.setImageUrl("https://placehold.co/600x400");
    fictionBook.setPrice(12.99);
    fictionBook.setCategory(books);

    Product selfHelpBook = new Product();
    selfHelpBook.setName("The Power of Habit");
    selfHelpBook.setDescription("An insightful self-help book on building and breaking habits.");
    selfHelpBook.setImageUrl("https://placehold.co/600x400");
    selfHelpBook.setPrice(14.99);
    selfHelpBook.setCategory(books);

    Product cookbook = new Product();
    cookbook.setName("MasterChef Recipes");
    cookbook.setDescription("A cookbook with delicious recipes for beginners and professionals.");
    cookbook.setImageUrl("https://placehold.co/600x400");
    cookbook.setPrice(19.99);
    cookbook.setCategory(books);

    Product childrenBook = new Product();
    childrenBook.setName("Fairy Tales for Kids");
    childrenBook.setDescription("A collection of classic fairy tales to spark imagination.");
    childrenBook.setImageUrl("https://placehold.co/600x400");
    childrenBook.setPrice(9.99);
    childrenBook.setCategory(books);

    Product techBook = new Product();
    techBook.setName("Java Programming Essentials");
    techBook.setDescription("A comprehensive guide to mastering Java programming.");
    techBook.setImageUrl("https://placehold.co/600x400");
    techBook.setPrice(29.99);
    techBook.setCategory(books);

    productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender, lipstick, foundation, mascara,
        eyeshadowPalette, sofa, bike, teddyBear, puzzle, boardGame, fictionBook, selfHelpBook, cookbook, childrenBook,
        techBook));

  }
}
