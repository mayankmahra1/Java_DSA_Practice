import java.util.Hashtable;

public class hashTables2 {

    public static void main(String[] args) {
        

        // lets create our hashtable in java
        // list the data types of our key value pairs
        // if we need to store primitive data types we can use the appropriate wrapper class
        // integer will be  the key the strings will be the value
        // we'll map studentID nums and studentNames 

        // in java when we create a hashtable these have an initial capacity of 11 and a load factor of 0.75 
        // so once 75% of our elements are filled this hash table will dynamically expand to accomodate more elements
        // now you can set a different capacity for your hashtable 
        // lets say 10 to be consistent with out example and lets say 50% for our load factor
        // and a f at the end for floating point number 
        // Hashtable<Integer, String> table = new Hashtable<>(10, 0.5f);

        Hashtable<Integer, String> table = new Hashtable<>(10);

        // lets start adding some key value pairs
        // to add an element to your hash table use the put method 
        // and we will pass an integer as the key and a string as the value 

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        // to acess one of the values you can use the get method of table 
        System.out.println(table.get(100));

        // if you need to remove an entry
        // table.remove(555); 


        // how could we display all the key value pairs of a table 
        // we could use a for loop 
        // so to iterate over the keys of our table 
        // we can use an ehanced for loop 
        // we are iterating over integers

        // so to make our hash table iterable we can get all the keys from our table and put them in a set
        // a set is iterable
        // .keySet() this will take all our keys and return a set
        
        // and a set is something we can iterate over 
        // this displays all our key value pairs

        for(Integer key : table.keySet())
            {
                System.out.println(key + "\t" + table.get(key));
            }

            System.out.println();


        // now to get a better idea as to where these key value pairs are being placed 
        // lets also display each hash code for each of these elements
        // so preceeding our key lets display each hash code
        // if we are using the hashcode of integers
        // this will return the primitive integer value represented by the key we are passing in
        // if were using the hashcode method of integers, well the hash is going to end being the same as the integer

        for(Integer key : table.keySet())
            {
                System.out.println(key.hashCode() + "\t" + key + "\t" + table.get(key));
            }


            System.out.println();


        // to calculate an index we can follow the hash with a % and the size of our table 
        for(Integer key : table.keySet())
            {
                    System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
            }

        // now if our data type was string we would use a different hashing formula 
        System.out.println();

        Hashtable<String, String> table1 = new Hashtable<>(10);

        table1.put("100", "Spongebob");
        table1.put("123", "Patrick");
        table1.put("321", "Sandy");
        table1.put("555", "Squidward");
        table1.put("777", "Gary");

        // get rid of modulo 
        // change data type of for loop to string
        // these are the new hashes for each of our keys 
        // different data types have diff hashcode formulas
        // now lets calculate the element in which each of these entries is going to be placed
        // by adding modulos the size of our hashtable 10
        for(String key : table1.keySet())
            {
                    System.out.println(key.hashCode() + "\t" + key + "\t" + table1.get(key));
            }


            System.out.println();
        // now lets calculate the element in which each of these entries is going to be placed
        // by adding modulos the size of our hashtable 10
        for(String key : table1.keySet())
            {
                    System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table1.get(key));
            }

        // we actually have 2 collisons 
        // we have it with two keys they are both in bucket 5 and the same for bucekt 0 
        // since theres more than one entry within the same element 
        // we will treat this bucket as a linked list 
        // and just itreate over it linearly until we reach the key we are looking for 
        // now one  way we can avoid collisons is to increase the size of our hashtable 


        System.out.println();

        // if we set this to the default of 11 and change this to modulo 11
        Hashtable<String, String> table2 = new Hashtable<>(11);


        table2.put("100", "Spongebob");
        table2.put("123", "Patrick");
        table2.put("321", "Sandy");
        table2.put("555", "Squidward");
        table2.put("777", "Gary");


        // well then this will be placed in diff buckets as we can see the modulo hashes have changed
        // however we still have a collison with squiadward and spongebob 
        for(String key : table2.keySet())
            {
                    System.out.println(key.hashCode() % 11 + "\t" + key + "\t" + table2.get(key));
            }

        System.out.println();

        // so what if we increase this to 21
        Hashtable<String, String> table3 = new Hashtable<>(21);


        table3.put("100", "Spongebob");
        table3.put("123", "Patrick");
        table3.put("321", "Sandy");
        table3.put("555", "Squidward");
        table3.put("777", "Gary");

        // no collisons now these keys are within their own buckets 
        for(String key : table3.keySet())
            {
                    System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + table3.get(key));
            }




    }

    // Overall summary 

    	// Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
        //             when you declare a hashtable you state the data types of what your storing and these are
        //             refernce data types 
    	//			   Each key/value pair is known as an Entry
    	//			   FAST insertion, look up, deletion of key/value pairs
    	// 			   Not ideal for small data sets, great with large data sets
    	
    	// hashing = Takes a key and computes an integer (formula will vary based on key & data type)
    	//		       In a Hashtable, we use the hash % capacity to calculate an index number 
    	
    	//			key.hashCode() % capacity = index  
    	
    	// bucket = an indexed storage location for one or more Entries
    	//	            can store multiple Entries in case of a collision (linked similarly a LinkedList)
    	
    	// collision = hash function generates the same index for more than one key
    	//			less collisions = more efficiency
    	
    	// Runtime complexity: Best Case O(1)
    	//                                     Worst Case O(n)
    
}