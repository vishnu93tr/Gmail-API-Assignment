package typicode;

public class Request {
    private String name;
    private String username;
    private String email;
    private address address;
    public Request(){

    }
    public Request(String name,String username,String email,address address){
        this.name=name;
        this.username=username;
        this.email=email;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public typicode.address getAddress() {
        return address;
    }

    public void setAddress(typicode.address address) {
        this.address = address;
    }
}
