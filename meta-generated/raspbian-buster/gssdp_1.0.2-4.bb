PACKAGES = "${PN} gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
PROVIDES = "gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gssdp/gir1.2-gssdp-1.0_1.0.2-4_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gssdp/libgssdp-1.0-3_1.0.2-4_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gssdp/libgssdp-1.0-dev_1.0.2-4_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-gssdp-1.0 = "gir1.2-gssdp-1.0_1.0.2-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "f56d56f6b285df8311679d277d29e376f08d5b88cf86ff22aa569db4973ca13f"
SRC_URI[deb0.md5sum] = "6687a06a3360971abd990bedb77213ea"
DEBFILENAME_libgssdp-1.0-3 = "libgssdp-1.0-3_1.0.2-4_armhf.deb"
SRC_URI[deb1.sha256sum] = "e9d0bc5dc4f7adf6708dabeed47fdaa20ff084d69354631320aece8bd1cdaf6d"
SRC_URI[deb1.md5sum] = "d7493458380697d58e590e16bf02219e"
DEBFILENAME_libgssdp-1.0-dev = "libgssdp-1.0-dev_1.0.2-4_armhf.deb"
SRC_URI[deb2.sha256sum] = "f07294ed3c6997faa7a9d191192029904cf431cf242258a09978202e242539f7"
SRC_URI[deb2.md5sum] = "f120f538625f76730d10a36c4aca5af2"

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
