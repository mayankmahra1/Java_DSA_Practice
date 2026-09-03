public class hashTables {

    public static void main(String[] args) {

        // a hash table is a collection of key value pairs 
        // each key value pair is known as an entry 
        // Entry<K, V>
        // we have 2 pieces of data 
        // the first is the key and the second is the value 

        // in this example lets pretend we are a teacher and we need to create a Hashtable for all of our students
        // each student has a name and a unique student id number
        // but these can be of any data type you like 
        // in this example the key is an integer and the value is a string 
        // so how do we know at which index to place each of these entries
        // 100, "Spongebob" 
        // 123 "Patrick"
        // 321 "Sandy"
        // 555 "Squidward"
        // 777 "Gary"
        // ...   ....

        // what we can do is take each key and insert it into the hashcode method 
        // the hashcode method will take the key as input plug into the formula and spit out an integer and this integer
        // is known as a hash 
        // now if we are finding the hashcode of an integer in java thats acc real easy. the formula is the number itself 
        // so hash of 100 is 100 
        // now after finding the hash of all your keys what can we do
        // these numbers are way too large and the size of our hash table is only ten elements
        // what we will do is take each of  these hashes and divide/% them by the capacity
        // the capacity being the size of our hashtable 
        // so take each has divide it by the capacity of our hash table whatever the remainder is we will use the remainder as our index
        // and to find the remainder we will use the % operator 
        // but what if two hashes are calculated to have the same remainder
        // that is known as a collison 
        // and i can best demonstrate that with a seperate example 
        

        // in this example lets say each key is a string
        // each value is also a string so each entry is a pair of strings 
        // we will first need to find the hash of each of these keys using the key.hashCode();
        // the hashcode of a string uses a differnet formula which we dont need to know
        // but what we do need to know is that it outputs a inetegr

        // Entry<K, V> 
        // 100, "Spongebob" 
        // 123 "Patrick"
        // 321 "Sandy"
        // 555 "Squidward"
        // 777 "Gary"

        // and the next steps are the same as before tach each hash and divide it by the capacity of our hashtable and
        // find the remainder 
        
        // 48625
        // 48690
        // 50610
        // 52629
        // 54615

        // spongebob entries is now at index 5 of our hashtable 
        // patricks is at index 0 
        // sandys will also be zero, we have a collison, both of these entries will be located at the same index
        // each of these storage locations is aka as a bucket
        // and the common resolution for a collison in a hash table is that we will turn each bucket into a linked list 
        // if this bucket already has an entry which index 0 does
        // we will also add a address to the location of the next entry 
        // and keep on adding more if theres more entries within this bucket 
        // so in this way each bucket becomes a linked list 
        // if we are looking up a key, first we go to the index in which its located
        // if theres more than one entry we'll search linearly through this bucket as if its a linked list 
        // until we find the key that we are looking for 
        // thats the most common solution when there is a collison but ideally you would want each of these entries to be within 
        // there own bucket 
        // this process is known as chaining 
        // the less collisons there are the more efficent this hash table is going to look up  a value 
        // ideally you want each entry to be in its own bucket but collisons are possible 
        
        // to reduce collisons you can increase the size of the hash table 
        // but than again the hash table is going to use up our memory then 
        // so people usually find a balance between the two 

        
        
        



    }
}