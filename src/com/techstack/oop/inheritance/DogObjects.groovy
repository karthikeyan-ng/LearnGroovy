package com.techstack.oop.inheritance

class DogObjects extends Animal {
	
	static void main(args) {
		Dog dog1 = new Dog()
		dog1.name = "Jimmy"
		dog1.breed = "German Shephered"
//		dog1.eats()
		dog1.moves()
		dog1.dogName = "Buddy"
		dog1.plays()
		dog1.eats()
	}
}
