PACKAGES = "${PN} libgmp10"
PROVIDES = "libgmp10"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gmp/libgmp10_6.1.2+dfsg-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgmp10 = "libgmp10_6.1.2+dfsg-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "d0343f0b607e4ea8f3e749a77eeaf4c75aafc832901cdd19e87991e98c44bf90"
SRC_URI[deb0.md5sum] = "8aba0d185395dd67db4ebca3487da514"

RDEPENDS_lib${PN}10 = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

FILES_libgmp10 = " \
    ./usr/lib/arm-linux-gnueabihf/libgmp.so.10 \
    ./usr/lib/arm-linux-gnueabihf/libgmp.so.10.3.2 \
    ./usr/share/doc/libgmp10/README.Debian \
    ./usr/share/doc/libgmp10/changelog.Debian.gz \
    ./usr/share/doc/libgmp10/copyright\
"
