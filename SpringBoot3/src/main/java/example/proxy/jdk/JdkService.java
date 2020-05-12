/**
 * 
 */
package example.proxy.jdk;

/**
 * Description:
 * 
 * @version 1.0
 * @see
 * 
 * @author 王蕊
 * @date
 */
public class JdkService implements IJdkService
{

	/**
	 * @see IJdkService#service()
	 */
	@Override
	public void service()
	{
		System.out.println("service...");
	}

}
