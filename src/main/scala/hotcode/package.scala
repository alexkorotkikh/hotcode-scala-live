import java.util.Calendar

/**
 * User: alexkorotkikh
 * Date: 6/1/13
 * Time: 2:40 PM
 */
package object hotcode {
  implicit def intToDate(i: Int) = new {
    def daysAgo = {
      val instance = Calendar.getInstance()
      instance.add(Calendar.DAY_OF_MONTH, -i)
      instance.getTime
    }
  }

  implicit def anyToFmap[T](obj: T) = new {
    def fmap[R](f: (T) => R): R = f(obj)
  }
}
