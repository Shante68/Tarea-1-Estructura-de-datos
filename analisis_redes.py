import csv

csv_file = "datos_redes_sociales - datos_redes_sociales (1).csv"
datos = {
    "FACEBOOK": {},
    "TWITTER": {},
    "YOUTUBE": {}
}


with open(csv_file, encoding="utf-8") as f:
    reader = csv.reader(f)
    next(reader) 
    for row in reader:
        red = row[0].strip()
        concepto = row[1].strip()
        valores = row[3:9]  
        
        valores = [int(v.replace(",", "").replace('"', '').replace("%", "").strip()) if v and v.replace(",", "").replace('"', '').replace("%", "").strip().isdigit() else 0 for v in valores]
        datos[red][concepto] = valores

meses = ["Enero - Junio"]


tw_followers = datos["TWITTER"].get("SEGUIDORES (FOLLOWERS)", [0]*6)
dif_twitter = tw_followers[5] - tw_followers[0]
print(f"Diferencia de seguidores en Twitter entre Enero y Junio: {dif_twitter}")


yt_views = datos["YOUTUBE"].get("VISUALIZACIONES", [0]*6)
print("Meses disponibles:", ", ".join(meses))
mes1 = input("Selecciona el primer mes : ")
mes2 = input("Selecciona el segundo mes : ")

if mes1 in meses and mes2 in meses:
    idx1 = meses.index(mes1)
    idx2 = meses.index(mes2)
    dif_views = yt_views[idx2] - yt_views[idx1]
    print(f"Diferencia de visualizaciones de YouTube entre {mes1} y {mes2}: {dif_views}")
else:
    print("Meses inválidos.")


tw_crecimiento = datos["TWITTER"].get("CRECIMIENTO DE FOLLOWERS", [0]*6)
fb_crecimiento = datos["FACEBOOK"].get("CRECIMIENTO (seguidores)", [0]*6)
promedio_crecimiento = (sum(tw_crecimiento) + sum(fb_crecimiento)) / 12
print(f"Promedio de crecimiento de Twitter y Facebook entre Enero y Junio: {promedio_crecimiento:.2f}")


yt_likes = datos["YOUTUBE"].get("ME GUSTA", [0]*6)
tw_likes = datos["TWITTER"].get("ME GUSTA", [0]*6)
fb_likes = datos["FACEBOOK"].get("ME GUSTA EN PUBLICACIONES", [0]*6)
total_likes = yt_likes + tw_likes + fb_likes
promedio_likes = sum(total_likes) / len(total_likes)
print(f"Promedio de 'Me gusta' de YouTube, Twitter y Facebook: {promedio_likes:.2f}")
