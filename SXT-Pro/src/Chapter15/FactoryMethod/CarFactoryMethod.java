package Chapter15.FactoryMethod;

/**
 * factory method pattern is a creational pattern that uses factory methods 
 * to deal with the problem of creating objects without having to specify 
 * the exact class of the object that will be created. This is done by 
 * creating objects by calling a factory method (either specified in an interface 
 * and implemented by child classes, or implemented in a base class and optionally 
 * overridden by derived classes) rather than by calling a constructor.
 * 
 * Implemented By CarAudiFactoryMethod, CarBenzFactoryMethod..... 
 * @author Woo
 *
 */
public interface CarFactoryMethod {
	public Car createCar();
}
