package arraysLecture;

public class Cars {
  public Cars(){
      System.out.println("heres a car");
  }

private String make;
  private String model;
  private int year;

  public void drive(){
      System.out.println("Thump thump...?");
  }

  public int getYear(){
      return year;
  }

  public String getModel(){
      return model;
  }
    public String getMake(){
        return make;
    }

  public void setMake(){
      this.make = make;
  }

    public void setModel(){
        this.model = model;
    }

    public void setYear(){
        this.year = year;
    }


}
