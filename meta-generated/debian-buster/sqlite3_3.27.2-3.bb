PACKAGES = "${PN} libsqlite3-0"
PROVIDES = "libsqlite3-0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/sqlite3/libsqlite3-0_3.27.2-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsqlite3-0 = "libsqlite3-0_3.27.2-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "cd7040cec8f05f06c40afea3d3e857890d9fd96ee4aecf61c8c7c0cf72d23004"
SRC_URI[deb0.md5sum] = "d48912647d18dbdb5f59cc131251cc3a"

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
