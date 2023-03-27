import java.io.FileWriter;

public class Product 
{
public static void main(String[] args) 
{
	StringBuilder sb= new StringBuilder();
	  
	sb.append("Product Name").append(",").append("Product Price").append(",").append("Product Code").append(",").append("Model Number").append(",").append("Product Category").append(",").append("Product Description").append(",").append("\n");
	
	sb.append("Quill Brand® 100% Recycled Hanging File Folders");
	sb.append(",");
	sb.append("$18.59");
	sb.append(",");
	sb.append("901-7Q5215");
	sb.append(",");
	sb.append("7Q5215");
	sb.append(",");
	sb.append("Accessories");
	sb.append(",");
	sb.append("Quill Brand Standard Hanging File Folders Make Filing Easier");
	
	sb.append("\n");
	         
	
	sb.append("Pendaflex® SureHook® 5-Tab Hanging File Folders");
	sb.append(",");
	sb.append("$24,79");
	sb.append(",");
	sb.append("901-615215");
	sb.append(",");
	sb.append(" 6152 1/5");
	sb.append(",");
	sb.append("Accessories");
	sb.append(",");
	sb.append("Pendaflex SureHook hanging file folders feature longer plastic hooks and built-in tension springs that keep your filing system in order.");
	
	sb.append("\n");
	
	sb.append("Staples Reinforced Box Bottom Hanging File Folder ");
	sb.append(",");
	sb.append("$26.99");
	sb.append(",");
	sb.append("901-884240");
	sb.append(",");
	sb.append("TR20027");
	sb.append(",");
	sb.append("Accessories");
	sb.append(",");
	sb.append("Arrange bulk files neatly inside these Staples Business Essentials letter-size standard green hanging file folders");
	
	sb.append("\n");
	
	sb.append("Pendaflex SureHook 5-Tab Hanging File Folders");
	sb.append(",");
	sb.append("$27.99");
	sb.append(",");
	sb.append(" 901-615215AD");
	sb.append(",");
	sb.append(" 6152 1/5 ASST");
	sb.append(",");
	sb.append("Accessories");
	sb.append(",");
	sb.append("Pendaflex SureHook multicolored five-tab letter-sized hanging folders have longer hooks for a better fit.");
	
	sb.append("\n");
	
	sb.append("Smead FasTab Hanging File Folders ");
	sb.append(",");
	sb.append("$25.99");
	sb.append(",");
	sb.append("901-64053QL");
	sb.append(",");
	sb.append("64053");
	sb.append(",");
	sb.append("Accessories");
	sb.append(",");
	sb.append("These files' durable construction withstands everyday use, so you can use them often");
	
	sb.append("\n");
	
	sb.append("Staples Hanging File Folder Green");
	sb.append(",");
	sb.append("$29.99");
	sb.append(",");
	sb.append("901-266262");
	sb.append(",");
	sb.append("TR266262");
	sb.append(",");
	sb.append("Accessories");
	sb.append(",");
	sb.append("Build a customized filing system with these Staples letter-size standard green hanging file folders");
	
	sb.append("\n");
	
	sb.append("Staples Hanging File Folder Purple");
	sb.append(",");
	sb.append("&29.99");
	sb.append(",");
	sb.append("901-419200");
	sb.append(",");
	sb.append("TR419200");
	sb.append(",");
	sb.append("Accessories");
	sb.append(",");
	sb.append("Extend the life span of critical documents using these Staples letter-size purple hanging file folders");
	
	sb.append("\n");
	
	sb.append("Quill Brand® File Folders Manila");
	sb.append(",");
	sb.append("$14.49");
	sb.append(",");
	sb.append("901-740137");
	sb.append(",");
	sb.append(" A113");
	sb.append(",");
	sb.append("Accessories");
	sb.append(",");
	sb.append("Make filing documents easy with these  standard letter-size manila file folders");
	
	sb.append("\n");
	
	sb.append("Staples Hanging File Folder");
	sb.append(",");
	sb.append("$15.99");
	sb.append(",");
	sb.append("901-163519");
	sb.append(",");
	sb.append("TR163519");
	sb.append(",");
	sb.append("Accessories");
	sb.append(",");
	sb.append("Color-code client files and business documents with this Staples five-tab letter-size yellow hanging file folder.");
	
	sb.append("\n");
	
	sb.append("Quill Brand® Hanging File Folders");
	sb.append(",");
	sb.append("$25.99");
	sb.append(",");
	sb.append("901-7387QGR");
	sb.append(",");
	sb.append("7387QGR");
	sb.append(",");
	sb.append("Accessories");
	sb.append(",");
	sb.append("Quill Brand Hanging File Folders Offer Sturdy Storage");
	
	sb.append("\n");
	
	  
	 try ( FileWriter fileWriter = new FileWriter("C:\\Users\\ARUNA\\Accessories.csv ") ) 
	  {
	   fileWriter.write(sb.toString());
	   System.out.println("Created!!!");
	  } 
	  catch(Exception ex) 
	  {
	   ex.printStackTrace();
	  }
}

}
