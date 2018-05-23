//https://www.codewars.com/kata/577bd8d4ae2807c64b00045b

std::string declareWinner(Fighter* fighter1, Fighter* fighter2, std::string firstAttacker)
{
    if(!fighter1->getName().compare(firstAttacker)){
    
    while(1){
    fighter2->setHealth(fighter2->getHealth() - fighter1->getDamagePerAttack());
    if(fighter2->getHealth() <= 0) return fighter1->getName();
    
    fighter1->setHealth(fighter1->getHealth() - fighter2->getDamagePerAttack());
    
    if(fighter1->getHealth() <= 0) return fighter2->getName();
    }
    }
    
    else{
    
    while(1){
    fighter1->setHealth(fighter1->getHealth() - fighter2->getDamagePerAttack());
    if(fighter1->getHealth() <= 0) return fighter2->getName();
    
    fighter2->setHealth(fighter2->getHealth() - fighter1->getDamagePerAttack());
    if(fighter2->getHealth() <= 0) return fighter1->getName();
    
   
    }
    }
    // Your code goes here. Have fun!
}