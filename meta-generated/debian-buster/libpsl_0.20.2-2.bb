PACKAGES = "${PN} libpsl5"
PROVIDES = "libpsl5"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libp/libpsl/libpsl5_0.20.2-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpsl5 = "libpsl5_0.20.2-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "1f893c63b9cf19974e4404492c00fad1cd48a61128a3f4d4146851dbdbd72a51"
SRC_URI[deb0.md5sum] = "26877443870f1885a8a05cdfa7c84667"

RDEPENDS_${PN}5 = "libc6 (>= 2.4) libidn2-0 (>= 0.16) libunistring2 (>= 0.9.7)"
DEPENDS = "libc6 libidn2-0 libunistring2"


inherit deb_group

FILES_libpsl5 = " \
    ./usr/lib/arm-linux-gnueabihf/libpsl.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libpsl.so.5.3.1 \
    ./usr/share/doc/libpsl5/changelog.Debian.gz \
    ./usr/share/doc/libpsl5/changelog.gz \
    ./usr/share/doc/libpsl5/copyright\
"
