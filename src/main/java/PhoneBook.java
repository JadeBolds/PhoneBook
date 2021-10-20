import java.util.*;


public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this(new HashMap<>());
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> phoneNumbers = new ArrayList<String>();
        phoneNumbers.add(phoneNumber);
        phonebook.put(name, phoneNumbers);

        //name = "Autum";
        //phoneNumber = "123-456-7890";
    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.addAll(Arrays.asList(phoneNumbers));
        phonebook.put(name, numbers);
        //name = "Winter";
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        if(phonebook.containsKey(name)){
            return true;
        } else {
            return false;
        }
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        if(phonebook.containsValue(phoneNumber)){
            System.out.println(phoneNumber);
        }
        return "Phone number not on file";
    }

    public List<String> getAllContactNames() {
        return (List<String>) phonebook.keySet();
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
