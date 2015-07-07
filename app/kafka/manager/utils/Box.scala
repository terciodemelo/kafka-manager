package kafka.manager.utils

/**
 * Created by tercio on 7/7/15.
 */
case class Box[T](var value: T) {
  def get = value
  def set(v: T) = value = v
}
