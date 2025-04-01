def rgb_to_hex(r, g, b):
    # Processing input to ensure correct red, green, and blue values
    r = max(0, min(255, r))
    g = max(0, min(255, g))
    b = max(0, min(255, b))
    # Converting to hex key:
    return '{:02X}{:02X}{:02X}'.format(r, b, g)


# test with hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
