PACKAGES = "${PN} gcc-8-base libgcc1 libstdc++6"
PROVIDES = "gcc-8-base libgcc1 libstdc++6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gcc-8/gcc-8-base_8.3.0-6_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/g/gcc-8/libgcc1_8.3.0-6_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/g/gcc-8/libstdc++6_8.3.0-6_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gcc-8-base = "gcc-8-base_8.3.0-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "69fdbaf7dc4fe5afb1f9c4242f207688b6aa3e8fe53af9be7a2118cd69852e57"
SRC_URI[deb0.md5sum] = "0b875383d56abf695de1fd5bf7d92137"
DEBFILENAME_libgcc1 = "libgcc1_8.3.0-6_armhf.deb"
SRC_URI[deb1.sha256sum] = "2303bab1cc54099a8de5ced6601c10d4abedc62d3c12addc097f03cba1355d2d"
SRC_URI[deb1.md5sum] = "f8f1e1d15db4f6e6b2f23ec2790ac5f2"
DEBFILENAME_libstdc++6 = "libstdc++6_8.3.0-6_armhf.deb"
SRC_URI[deb2.sha256sum] = "2a22648689ca745554599a818f01241605b2548540d62026116cb07a15df8d09"
SRC_URI[deb2.md5sum] = "bca7476bb079f3194fde055fc6c133c6"

RDEPENDS_${PN}-base = ""
RDEPENDS_libgcc1 = "gcc-8-base (= 8.3.0-6) libc6 (>= 2.4)"
RDEPENDS_libstdc++6 = "gcc-8-base (= 8.3.0-6) libc6 (>= 2.18) libgcc1 (>= 1:3.5)"
DEPENDS = "libc6"


inherit deb_group

FILES_gcc-8-base = " \
    ./usr/share/doc/gcc-8-base/README.Debian.armhf.gz \
    ./usr/share/doc/gcc-8-base/TODO.Debian \
    ./usr/share/doc/gcc-8-base/changelog.Debian.gz \
    ./usr/share/doc/gcc-8-base/copyright\
"
FILES_libgcc1 = " \
    ./lib/arm-linux-gnueabihf/libgcc_s.so.1 \
    ./usr/share/doc/libgcc1 \
    ./usr/share/lintian/overrides/libgcc1\
"
FILES_libstdc++6 = " \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.25 \
    ./usr/share/doc/libstdc++6 \
    ./usr/share/gcc-8/python/libstdcxx/__init__.py \
    ./usr/share/gcc-8/python/libstdcxx/v6/__init__.py \
    ./usr/share/gcc-8/python/libstdcxx/v6/printers.py \
    ./usr/share/gcc-8/python/libstdcxx/v6/xmethods.py \
    ./usr/share/gdb/auto-load/usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.25-gdb.py\
"
