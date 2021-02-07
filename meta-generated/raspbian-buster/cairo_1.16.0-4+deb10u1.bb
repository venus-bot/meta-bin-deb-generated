PACKAGES = "${PN} libcairo-gobject2 libcairo2"
PROVIDES = "libcairo-gobject2 libcairo2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/c/cairo/libcairo-gobject2_1.16.0-4+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/c/cairo/libcairo2_1.16.0-4+deb10u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libcairo-gobject2 = "libcairo-gobject2_1.16.0-4+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "a77b3ef4a394dff24fe9b8eb17dcebb078862538c66e43b9265041c6734a8c25"
SRC_URI[deb0.md5sum] = "ac3aa20ba7a1712fbf230ffffb42041f"
DEBFILENAME_libcairo2 = "libcairo2_1.16.0-4+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "8094c8fd81e0199447120c207541686f5ac608fbb0026573e9c84bf1c16a2dbf"
SRC_URI[deb1.md5sum] = "d2919bc79bcda79719b329b53396c9ad"

RDEPENDS_lib${PN}-gobject2 = "libcairo2 (>= 1.10.0) libglib2.0-0 (>= 2.14.0)"
RDEPENDS_lib${PN}2 = "libc6 (>= 2.11) libfontconfig1 (>= 2.12.6) libfreetype6 (>= 2.9.1) libpixman-1-0 (>= 0.30.0) libpng16-16 (>= 1.6.2-1) libx11-6 libxcb-render0 libxcb-shm0 libxcb1 (>= 1.6) libxext6 libxrender1 zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libfontconfig1 libfreetype6 libglib2.0-0 libpixman-1-0 libpng16-16 libx11-6 libxcb-render0 libxcb-shm0 libxcb1 libxext6 libxrender1 zlib1g"


inherit deb_group

FILES_libcairo-gobject2 = " \
    ./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2.11600.0 \
    ./usr/share/doc/libcairo-gobject2/changelog.Debian.gz \
    ./usr/share/doc/libcairo-gobject2/changelog.gz \
    ./usr/share/doc/libcairo-gobject2/copyright\
"
FILES_libcairo2 = " \
    ./usr/lib/arm-linux-gnueabihf/libcairo.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libcairo.so.2.11600.0 \
    ./usr/share/doc/libcairo2/AUTHORS.gz \
    ./usr/share/doc/libcairo2/NEWS.gz \
    ./usr/share/doc/libcairo2/README.gz \
    ./usr/share/doc/libcairo2/changelog.Debian.gz \
    ./usr/share/doc/libcairo2/changelog.gz \
    ./usr/share/doc/libcairo2/copyright\
"
