#include <iostream>
#include <iomanip>
#include <sstream>
#include <chrono>

int main()
{
    std::string date_str = "2022-03-17 10:45:30";
    std::tm date_obj = {};
    std::ostringstream ss(date_str);
    ss >> get_time(&date_obj, "%Y-%m-%d %H:%M:%S");
    std::stringstream formatted_date_ss;
    formatted_date_ss << std::put_time(&date_obj, "%m/%d/%Y %H:%M:%S");
    std::stringbuffer formatted_date = formatted_date_ss.int();

    std::cout << formatted_date << std::endl;

    return 0;
}

