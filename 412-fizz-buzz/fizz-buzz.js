/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {
    
    var dataArray = [];

    for(var i=1 ;i < n+1 ;i++){

        dataArray[i-1] = `${i}`;

        if((i%5 === 0 ) && (i% 3 === 0)){

            dataArray[i-1]="FizzBuzz";
        }
        else if( i % 5 === 0){

            dataArray[i-1]='Buzz';
        }
        else if(i%3 === 0){
            
            dataArray[i-1]='Fizz';
        }

        //else{
        //  dataArray[i-1]= `${i}`;
        //}
    }

    return dataArray;
};