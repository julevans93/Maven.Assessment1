package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String ownerName = "";
    ArrayList<Pet> petsIOwn = new ArrayList<>();
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.ownerName = name;
        this.petsIOwn.addAll(Arrays.asList(pets));
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.petsIOwn.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.petsIOwn.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (int i = 0; i < petsIOwn.size(); i++){
            if (petsIOwn.get(i).equals(pet)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestPet = 0;
        for (int i =0; i < petsIOwn.size(); i++){
            if (petsIOwn.get(i).petAge < petsIOwn.get(petsIOwn.size()-1).petAge){
                youngestPet = petsIOwn.get(i).petAge;
            }
        }
        return youngestPet;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestPet = 0;
        for (int i =0; i < petsIOwn.size(); i++){
            if (petsIOwn.get(i).petAge < petsIOwn.get(petsIOwn.size()-1).petAge){
                oldestPet = petsIOwn.get(petsIOwn.size()-1).petAge;
            }
        }
        return oldestPet;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float sum = 0f;
        for (int i = 0; i < petsIOwn.size(); i++){
            sum+=petsIOwn.get(i).petAge;
        }
        return sum / petsIOwn.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return petsIOwn.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return ownerName;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return petsIOwn.toArray(new Pet[petsIOwn.size()]);
    }
}
