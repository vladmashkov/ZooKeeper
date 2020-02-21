trait Animal
class Fish extends Animal
class Cat extends Animal
class Snake extends Animal
trait ZooKeeper[-A]
object Main extends App() {
  def cleanFish[A](zk: ZooKeeper[Fish]): Unit = println("Fish room cleaned")
  def cleanCat[A](zk: ZooKeeper[Cat]): Unit = println("Cat room cleaned")
  def cleanSnake[A](zk: ZooKeeper[Snake]): Unit = println("Snake room cleaned")
  val zooKeeper = new ZooKeeper[Animal] {}
  val zooKeeperFish = new ZooKeeper[Fish] {}
  val zooKeeperCat = new ZooKeeper[Cat] {}
  val zooKeeperSnake = new ZooKeeper[Snake] {}
}