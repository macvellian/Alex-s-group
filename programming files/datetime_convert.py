from datetime import datetime

date_str = "2022-03-17 10:45:30" // inputs date string
date_obj = datetime.strptime(date_str, '%Y-%m-%d %H:%M:%S') // converts str to date object
formatted_date = date_obj.strftime('%m/%d/%Y %H:%M:%S') // formats the date

print(formatted_date)
