PACKAGES = "${PN} gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
PROVIDES = "gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gssdp/gir1.2-gssdp-1.0_1.0.2-4_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/g/gssdp/libgssdp-1.0-3_1.0.2-4_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/g/gssdp/libgssdp-1.0-dev_1.0.2-4_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-gssdp-1.0 = "gir1.2-gssdp-1.0_1.0.2-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "f56d56f6b285df8311679d277d29e376f08d5b88cf86ff22aa569db4973ca13f"
SRC_URI[deb0.md5sum] = "6687a06a3360971abd990bedb77213ea"
DEBFILENAME_libgssdp-1.0-3 = "libgssdp-1.0-3_1.0.2-4_armhf.deb"
SRC_URI[deb1.sha256sum] = "671aef62bd7b8cd569879428e0b90321a139f5aa9b6c2ad78bc83946ea7f2f0a"
SRC_URI[deb1.md5sum] = "c19cfbfa345fbf438fbdb640421fb4aa"
DEBFILENAME_libgssdp-1.0-dev = "libgssdp-1.0-dev_1.0.2-4_armhf.deb"
SRC_URI[deb2.sha256sum] = "03ee80fda91f214506774bd132eb57b010c3d2c79e246d90ddc0713fb1abaee1"
SRC_URI[deb2.md5sum] = "6b359cfdccf7007a11c37063e60df5fc"

RDEPENDS_gir1.2-${PN}-1.0 = "gir1.2-glib-2.0 (>= 0.9.12) gir1.2-soup-2.4 (>= 2.26.1) libgssdp-1.0-3 (>= 0.14.16)"
RDEPENDS_lib${PN}-1.0-3 = "libc6 (>= 2.7) libglib2.0-0 (>= 2.37.3) libsoup2.4-1 (>= 2.26.1)"
RDEPENDS_lib${PN}-1.0-dev = "gir1.2-gssdp-1.0 (= 1.0.2-4) libgssdp-1.0-3 (= 1.0.2-4) libsoup2.4-dev"
DEPENDS = "gir1.2-glib-2.0 gir1.2-soup-2.4 libc6 libglib2.0-0 libsoup2.4-1 libsoup2.4-dev"


inherit deb_group

FILES_gir1.2-gssdp-1.0 = " \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/GSSDP-1.0.typelib \
    ./usr/share/doc/gir1.2-gssdp-1.0/changelog.Debian.gz \
    ./usr/share/doc/gir1.2-gssdp-1.0/copyright\
"
FILES_libgssdp-1.0-3 = " \
    ./usr/lib/arm-linux-gnueabihf/libgssdp-1.0.so.3 \
    ./usr/lib/arm-linux-gnueabihf/libgssdp-1.0.so.3.0.1 \
    ./usr/share/doc/libgssdp-1.0-3/changelog.Debian.gz \
    ./usr/share/doc/libgssdp-1.0-3/copyright\
"
FILES_libgssdp-1.0-dev = " \
    ./usr/include/gssdp-1.0/libgssdp/gssdp-client.h \
    ./usr/include/gssdp-1.0/libgssdp/gssdp-error.h \
    ./usr/include/gssdp-1.0/libgssdp/gssdp-resource-browser.h \
    ./usr/include/gssdp-1.0/libgssdp/gssdp-resource-group.h \
    ./usr/include/gssdp-1.0/libgssdp/gssdp.h \
    ./usr/lib/arm-linux-gnueabihf/libgssdp-1.0.a \
    ./usr/lib/arm-linux-gnueabihf/libgssdp-1.0.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/gssdp-1.0.pc \
    ./usr/share/doc/libgssdp-1.0-dev/changelog.Debian.gz \
    ./usr/share/doc/libgssdp-1.0-dev/copyright \
    ./usr/share/gir-1.0/GSSDP-1.0.gir \
    ./usr/share/vala/vapi/gssdp-1.0.deps \
    ./usr/share/vala/vapi/gssdp-1.0.vapi\
"
