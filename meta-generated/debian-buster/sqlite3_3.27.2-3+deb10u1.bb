PACKAGES = "${PN} libsqlite3-0"
PROVIDES = "libsqlite3-0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/sqlite3/libsqlite3-0_3.27.2-3+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsqlite3-0 = "libsqlite3-0_3.27.2-3+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "f35d1f408b1ef9e6c0cbb2d5989f60f06faa07536a9b0ffd5c07f3b2be2eb301"
SRC_URI[deb0.md5sum] = "bca275e55f961a82c637e2811d4a122a"

RDEPENDS_lib${PN}-0 = "libc6 (>= 2.28)"
DEPENDS = "libc6"


inherit deb_group

FILES_libsqlite3-0 = " \
    ./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0.8.6 \
    ./usr/share/doc/libsqlite3-0/README.Debian \
    ./usr/share/doc/libsqlite3-0/changelog.Debian.gz \
    ./usr/share/doc/libsqlite3-0/changelog.gz \
    ./usr/share/doc/libsqlite3-0/changelog.html.gz \
    ./usr/share/doc/libsqlite3-0/copyright\
"
