import axios from 'axios'

class EmployeeService {

    getAllEmployees(){
        return axios.get("http://localhost:8081/demo/data?RT=1002")
    }
}

export default new EmployeeService();