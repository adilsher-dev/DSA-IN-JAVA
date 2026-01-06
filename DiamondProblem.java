interface GPS {
    void location();
}

interface Camera {
    void clickPhoto();//this is the abstract method thats why we needs interfacesexcet
}

class SmartPhone implements GPS, Camera {

    public void location() {
        System.out.println("Showing location");
    }

    public void clickPhoto() {
        System.out.println("Photo clicked");
    }
}

//class can implements the interfaces but interfaces aapas me nhi kr skte
//interfaces sirf inheritance kr skte hai mtlb extends
//default methods ko classes override kar bhi skti hai aur nahi bhi