/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */

public class SortString {
	  private String str1;
	  private String str2;
	  private String str3;

/**
Constructs a data set that processes three strings.
@param str1 the first string to sort
@param str2 the second string to sort
@param str3 the third string to sort
*/
public SortString(String str1, String str2, String str3)
{
	  this.str1 = str1;
	  this.str2 = str2;
	  this.str3 = str3;
}

/**
Gets the smallest string in the data set.
@return smallest the smallest of three strings
*/
public String getSmallest()
{
	String tmpmin = "";
	if(str1.compareTo(str2)<0){
		tmpmin = str1;
	}else{
		tmpmin = str2;
	}
	if(str3.compareTo(tmpmin)<0){
		tmpmin = str3;
	}
    return tmpmin;
}

/**
Gets the largest string in the data set.
@return largest the largest of three strings
*/
public String getLargest()
{
	String tmp = "";
	if(str1.compareTo(str2)>0){
		tmp = str1;
	}else{
		tmp = str2;
	}
	if(str3.compareTo(tmp)>0){
		tmp = str3;
	}
	return tmp;

}

/**
Gets the middle string in the data set.
@return middle the middle string of three strings
*/
public String getMiddle()
{
	String tmp = "";
	String min = getSmallest();
	String max = getLargest();
	if(str1.compareTo(min)>0&&str1.compareTo(max)<0){
		tmp = str1;
	}else
	if(str2.compareTo(min)>0&&str1.compareTo(max)<0){
		tmp = str2;
	}else
	if(str3.compareTo(min)>0&&str3.compareTo(max)<0){
		tmp = str3;
	}else
		if(str1.equals(min)){
			tmp = str1;
		}else
			if(str2.equals(min)){
				tmp = str2;
			}else
				if(str3.equals(min)){
					tmp = str3;
				}
    return tmp;
}
}
