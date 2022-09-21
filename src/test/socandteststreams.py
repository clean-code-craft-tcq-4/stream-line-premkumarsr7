import random

min_soc_threshold = 20
max_soc_threshold = 80

min_temperature_threshold = 0
max_temperature_threshold = 45

def soc_stream():
    soc_list = []
    for i in range(50):
        soc = random.randint(min_soc_threshold, max_soc_threshold)
        soc_list.append(soc)
    return soc_list


def temperature_stream():
    temperature_list = []
    for i in range(50):
        temp = random.randint(min_temperature_threshold, max_temperature_threshold)
        temperature_list.append(temp)
    return temperature_list

def stream_data():
	temperature_list = temperature_stream()
	soc_list = soc_stream()
	for temperature, soc in zip(temperature_list, soc_list):
		print(temperature,",",soc)

if __name__ == '__main__':
    stream_data()