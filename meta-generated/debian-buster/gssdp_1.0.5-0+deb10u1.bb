PACKAGES = "${PN} gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
PROVIDES = "gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gssdp/gir1.2-gssdp-1.0_1.0.5-0+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/g/gssdp/libgssdp-1.0-3_1.0.5-0+deb10u1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/g/gssdp/libgssdp-1.0-dev_1.0.5-0+deb10u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-gssdp-1.0 = "gir1.2-gssdp-1.0_1.0.5-0+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "bd036a97f23ab50694eecd2b93b66561dc02d2f2cc7dd66ed323bd2e7f34cc66"
SRC_URI[deb0.md5sum] = "e8fcc8c5cd8318a47b0f742ce8408208"
DEBFILENAME_libgssdp-1.0-3 = "libgssdp-1.0-3_1.0.5-0+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "925d4eabc7641eac0dfdd83192b787442ff88f932d51dd002f1ebce5a242e238"
SRC_URI[deb1.md5sum] = "a5a2a2aabac7c4f44f4c395b5d2d89c6"
DEBFILENAME_libgssdp-1.0-dev = "libgssdp-1.0-dev_1.0.5-0+deb10u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "f60aa356869d5124591e4f18dc4157fc351d187176f3947ce689d4397c27e970"
SRC_URI[deb2.md5sum] = "0d0bd3a2a3d7b4ee39350c30afee0921"

RDEPENDS_gir1.2-${PN}-1.0 = "gir1.2-glib-2.0 (>= 0.9.12) gir1.2-soup-2.4 (>= 2.26.1) libgssdp-1.0-3 (>= 1.0.5)"
RDEPENDS_lib${PN}-1.0-3 = "libc6 (>= 2.7) libglib2.0-0 (>= 2.37.3) libsoup2.4-1 (>= 2.26.1)"
RDEPENDS_lib${PN}-1.0-dev = "gir1.2-gssdp-1.0 (= 1.0.5-0+deb10u1) libgssdp-1.0-3 (= 1.0.5-0+deb10u1) libsoup2.4-dev"
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
