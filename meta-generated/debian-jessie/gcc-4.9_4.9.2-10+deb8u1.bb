PACKAGES = "${PN} gcc-4.9-base libatomic1 libgcc1 libgomp1 libstdc++6"
PROVIDES = "gcc-4.9-base libatomic1 libgcc1 libgomp1 libstdc++6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gcc-4.9/gcc-4.9-base_4.9.2-10+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/g/gcc-4.9/libatomic1_4.9.2-10+deb8u1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/g/gcc-4.9/libgcc1_4.9.2-10+deb8u1_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/g/gcc-4.9/libgomp1_4.9.2-10+deb8u1_armhf.deb;unpack=0;name=deb3\
	http://ftp.de.debian.org/debian/pool/main/g/gcc-4.9/libstdc++6_4.9.2-10+deb8u1_armhf.deb;unpack=0;name=deb4\
"
DEBFILENAME_gcc-4.9-base = "gcc-4.9-base_4.9.2-10+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "8264d56a62849c8002f6661817b101b99c7e91c4b357aa57c42037e14b395b5a"
SRC_URI[deb0.md5sum] = "441b32f83e7f8ab478f0a1266b2e37d5"
DEBFILENAME_libatomic1 = "libatomic1_4.9.2-10+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "08c6bd644f231db82582026958ede721e1921d778eb0bd3e4370afcf07b46ac2"
SRC_URI[deb1.md5sum] = "c6db6decac9eb0bcdf1143b1f2918ef4"
DEBFILENAME_libgcc1 = "libgcc1_4.9.2-10+deb8u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "a456c21c4805a3003586a492af1ddd68083de81f75f3da0807732ad44306541c"
SRC_URI[deb2.md5sum] = "8bec9b9c9024b56de5f1b0a5862578d0"
DEBFILENAME_libgomp1 = "libgomp1_4.9.2-10+deb8u1_armhf.deb"
SRC_URI[deb3.sha256sum] = "2693969878b641b37aa4195149f38a7d1347402ed375fe31e49d5f231b8e8d9c"
SRC_URI[deb3.md5sum] = "cf1375a81dffc9d3558c9fb6177b3405"
DEBFILENAME_libstdc++6 = "libstdc++6_4.9.2-10+deb8u1_armhf.deb"
SRC_URI[deb4.sha256sum] = "0f1c6f9640a3c4b8c4cabd805f9e6974fd74aa7f054109cf88da2770ce098efc"
SRC_URI[deb4.md5sum] = "e79265252d8252e87a1f69d4a8c189fb"

RDEPENDS_${PN}-base = ""
RDEPENDS_libatomic1 = "gcc-4.9-base (= 4.9.2-10+deb8u1) libc6 (>= 2.4) multiarch-support"
RDEPENDS_libgcc1 = "gcc-4.9-base (= 4.9.2-10+deb8u1) libc6 (>= 2.4) multiarch-support"
RDEPENDS_libgomp1 = "gcc-4.9-base (= 4.9.2-10+deb8u1) libc6 (>= 2.17) multiarch-support"
RDEPENDS_libstdc++6 = "gcc-4.9-base (= 4.9.2-10+deb8u1) libc6 (>= 2.18) libgcc1 (>= 1:4.4.0) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_gcc-4.9-base = " \
    ./usr/lib/gcc/arm-linux-gnueabihf/4.9.2 \
    ./usr/share/doc/gcc-4.9-base/README.Debian.armhf.gz \
    ./usr/share/doc/gcc-4.9-base/TODO.Debian \
    ./usr/share/doc/gcc-4.9-base/changelog.Debian.gz \
    ./usr/share/doc/gcc-4.9-base/copyright\
"
FILES_libatomic1 = " \
    ./usr/lib/arm-linux-gnueabihf/libatomic.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libatomic.so.1.1.0 \
    ./usr/share/doc/libatomic1\
"
FILES_libgcc1 = " \
    ./lib/arm-linux-gnueabihf/libgcc_s.so.1 \
    ./usr/share/doc/libgcc1 \
    ./usr/share/lintian/overrides/libgcc1\
"
FILES_libgomp1 = " \
    ./usr/lib/arm-linux-gnueabihf/libgomp.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libgomp.so.1.0.0 \
    ./usr/share/doc/libgomp1\
"
FILES_libstdc++6 = " \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.20 \
    ./usr/share/doc/libstdc++6 \
    ./usr/share/gcc-4.9/python/libstdcxx/__init__.py \
    ./usr/share/gcc-4.9/python/libstdcxx/v6/__init__.py \
    ./usr/share/gcc-4.9/python/libstdcxx/v6/printers.py \
    ./usr/share/gdb/auto-load/usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.20-gdb.py\
"
