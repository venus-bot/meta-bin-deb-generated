PACKAGES = "${PN} libsqlite3-0"
PROVIDES = "libsqlite3-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sqlite3/libsqlite3-0_3.27.2-3+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsqlite3-0 = "libsqlite3-0_3.27.2-3+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "61ea0a046f3153a73b89793ffbb21536df4e01ce5de1d8b6ede4b82437c8a4be"
SRC_URI[deb0.md5sum] = "064f0a34826731d9b60b1a0ccb8c52c5"

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
