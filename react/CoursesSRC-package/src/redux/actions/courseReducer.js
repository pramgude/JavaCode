export default function courseReducer(state= [],action){
    switch(action.type){
        case "create course" :
            return [...state,...action.course]
            default:
                return state
    }
}