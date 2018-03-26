PACKAGES = "${PN} icu-devtools libicu-dev libicu52"
PROVIDES = "icu-devtools libicu-dev libicu52"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/i/icu/icu-devtools_52.1-8+deb8u7_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/i/icu/libicu-dev_52.1-8+deb8u7_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/i/icu/libicu52_52.1-8+deb8u7_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_icu-devtools = "icu-devtools_52.1-8+deb8u7_armhf.deb"
SRC_URI[deb0.sha256sum] = "8d416d6a523d2bd085840c29ed4033093b5a8c9f435852b4dc969e529adc7fc8"
SRC_URI[deb0.md5sum] = "1553969beb7e455f31540eaae09bd082"
DEBFILENAME_libicu-dev = "libicu-dev_52.1-8+deb8u7_armhf.deb"
SRC_URI[deb1.sha256sum] = "6b66748601f7f510e327f29f5574a48a02d61edd8f6653d4656f2d52a56b238b"
SRC_URI[deb1.md5sum] = "94f9a5c3593b43eb0ad4625a07f58703"
DEBFILENAME_libicu52 = "libicu52_52.1-8+deb8u7_armhf.deb"
SRC_URI[deb2.sha256sum] = "846fddef81c28a5d700f19cc5cd9e4a9088e530f96b9c879ae65b956ca989ea5"
SRC_URI[deb2.md5sum] = "278226d265ea071f9799f5822944ff9a"

RDEPENDS_${PN}-devtools = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0) libicu52 (>= 52~m1-1~) libstdc++6 (>= 4.9)"
RDEPENDS_lib${PN}-dev = "libicu52 (= 52.1-8+deb8u7) icu-devtools (>= 52.1-8+deb8u7) libc6-dev"
RDEPENDS_lib${PN}52 = "libc6 (>= 2.7) libgcc1 (>= 1:4.4.0) libstdc++6 (>= 4.9)"
DEPENDS = "libstdc++6 libgcc1 libc6-dev libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_icu-devtools = " \
    ./usr/bin/derb \
    ./usr/bin/genbrk \
    ./usr/bin/gencfu \
    ./usr/bin/gencnval \
    ./usr/bin/gendict \
    ./usr/bin/genrb \
    ./usr/bin/icu-config \
    ./usr/bin/icuinfo \
    ./usr/bin/makeconv \
    ./usr/bin/pkgdata \
    ./usr/bin/uconv \
    ./usr/sbin/genccode \
    ./usr/sbin/gencmn \
    ./usr/sbin/gennorm2 \
    ./usr/sbin/gensprep \
    ./usr/sbin/icupkg \
    ./usr/share/doc/icu-devtools/NEWS.Debian.gz \
    ./usr/share/doc/icu-devtools/changelog.Debian.gz \
    ./usr/share/doc/icu-devtools/copyright \
    ./usr/share/man/man1/derb.1.gz \
    ./usr/share/man/man1/genbrk.1.gz \
    ./usr/share/man/man1/gencfu.1.gz \
    ./usr/share/man/man1/gencnval.1.gz \
    ./usr/share/man/man1/gendict.1.gz \
    ./usr/share/man/man1/genrb.1.gz \
    ./usr/share/man/man1/icu-config.1.gz \
    ./usr/share/man/man1/icuinfo.1.gz \
    ./usr/share/man/man1/makeconv.1.gz \
    ./usr/share/man/man1/pkgdata.1.gz \
    ./usr/share/man/man1/uconv.1.gz \
    ./usr/share/man/man8/genccode.8.gz \
    ./usr/share/man/man8/gencmn.8.gz \
    ./usr/share/man/man8/gennorm2.8.gz \
    ./usr/share/man/man8/gensprep.8.gz \
    ./usr/share/man/man8/icupkg.8.gz\
"
FILES_libicu-dev = " \
    ./usr/include/arm-linux-gnueabihf/layout/LEFontInstance.h \
    ./usr/include/arm-linux-gnueabihf/layout/LEGlyphFilter.h \
    ./usr/include/arm-linux-gnueabihf/layout/LEGlyphStorage.h \
    ./usr/include/arm-linux-gnueabihf/layout/LEInsertionList.h \
    ./usr/include/arm-linux-gnueabihf/layout/LELanguages.h \
    ./usr/include/arm-linux-gnueabihf/layout/LEScripts.h \
    ./usr/include/arm-linux-gnueabihf/layout/LESwaps.h \
    ./usr/include/arm-linux-gnueabihf/layout/LETableReference.h \
    ./usr/include/arm-linux-gnueabihf/layout/LETypes.h \
    ./usr/include/arm-linux-gnueabihf/layout/LayoutEngine.h \
    ./usr/include/arm-linux-gnueabihf/layout/ParagraphLayout.h \
    ./usr/include/arm-linux-gnueabihf/layout/RunArrays.h \
    ./usr/include/arm-linux-gnueabihf/layout/loengine.h \
    ./usr/include/arm-linux-gnueabihf/layout/playout.h \
    ./usr/include/arm-linux-gnueabihf/layout/plruns.h \
    ./usr/include/arm-linux-gnueabihf/unicode/alphaindex.h \
    ./usr/include/arm-linux-gnueabihf/unicode/appendable.h \
    ./usr/include/arm-linux-gnueabihf/unicode/basictz.h \
    ./usr/include/arm-linux-gnueabihf/unicode/brkiter.h \
    ./usr/include/arm-linux-gnueabihf/unicode/bytestream.h \
    ./usr/include/arm-linux-gnueabihf/unicode/bytestrie.h \
    ./usr/include/arm-linux-gnueabihf/unicode/bytestriebuilder.h \
    ./usr/include/arm-linux-gnueabihf/unicode/calendar.h \
    ./usr/include/arm-linux-gnueabihf/unicode/caniter.h \
    ./usr/include/arm-linux-gnueabihf/unicode/chariter.h \
    ./usr/include/arm-linux-gnueabihf/unicode/choicfmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/coleitr.h \
    ./usr/include/arm-linux-gnueabihf/unicode/coll.h \
    ./usr/include/arm-linux-gnueabihf/unicode/compactdecimalformat.h \
    ./usr/include/arm-linux-gnueabihf/unicode/curramt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/currpinf.h \
    ./usr/include/arm-linux-gnueabihf/unicode/currunit.h \
    ./usr/include/arm-linux-gnueabihf/unicode/datefmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/dbbi.h \
    ./usr/include/arm-linux-gnueabihf/unicode/dcfmtsym.h \
    ./usr/include/arm-linux-gnueabihf/unicode/decimfmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/docmain.h \
    ./usr/include/arm-linux-gnueabihf/unicode/dtfmtsym.h \
    ./usr/include/arm-linux-gnueabihf/unicode/dtintrv.h \
    ./usr/include/arm-linux-gnueabihf/unicode/dtitvfmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/dtitvinf.h \
    ./usr/include/arm-linux-gnueabihf/unicode/dtptngen.h \
    ./usr/include/arm-linux-gnueabihf/unicode/dtrule.h \
    ./usr/include/arm-linux-gnueabihf/unicode/enumset.h \
    ./usr/include/arm-linux-gnueabihf/unicode/errorcode.h \
    ./usr/include/arm-linux-gnueabihf/unicode/fieldpos.h \
    ./usr/include/arm-linux-gnueabihf/unicode/fmtable.h \
    ./usr/include/arm-linux-gnueabihf/unicode/format.h \
    ./usr/include/arm-linux-gnueabihf/unicode/fpositer.h \
    ./usr/include/arm-linux-gnueabihf/unicode/gender.h \
    ./usr/include/arm-linux-gnueabihf/unicode/gregocal.h \
    ./usr/include/arm-linux-gnueabihf/unicode/icudataver.h \
    ./usr/include/arm-linux-gnueabihf/unicode/icuplug.h \
    ./usr/include/arm-linux-gnueabihf/unicode/idna.h \
    ./usr/include/arm-linux-gnueabihf/unicode/listformatter.h \
    ./usr/include/arm-linux-gnueabihf/unicode/localpointer.h \
    ./usr/include/arm-linux-gnueabihf/unicode/locdspnm.h \
    ./usr/include/arm-linux-gnueabihf/unicode/locid.h \
    ./usr/include/arm-linux-gnueabihf/unicode/measfmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/measunit.h \
    ./usr/include/arm-linux-gnueabihf/unicode/measure.h \
    ./usr/include/arm-linux-gnueabihf/unicode/messagepattern.h \
    ./usr/include/arm-linux-gnueabihf/unicode/msgfmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/normalizer2.h \
    ./usr/include/arm-linux-gnueabihf/unicode/normlzr.h \
    ./usr/include/arm-linux-gnueabihf/unicode/numfmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/numsys.h \
    ./usr/include/arm-linux-gnueabihf/unicode/parseerr.h \
    ./usr/include/arm-linux-gnueabihf/unicode/parsepos.h \
    ./usr/include/arm-linux-gnueabihf/unicode/platform.h \
    ./usr/include/arm-linux-gnueabihf/unicode/plurfmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/plurrule.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ptypes.h \
    ./usr/include/arm-linux-gnueabihf/unicode/putil.h \
    ./usr/include/arm-linux-gnueabihf/unicode/rbbi.h \
    ./usr/include/arm-linux-gnueabihf/unicode/rbnf.h \
    ./usr/include/arm-linux-gnueabihf/unicode/rbtz.h \
    ./usr/include/arm-linux-gnueabihf/unicode/regex.h \
    ./usr/include/arm-linux-gnueabihf/unicode/region.h \
    ./usr/include/arm-linux-gnueabihf/unicode/rep.h \
    ./usr/include/arm-linux-gnueabihf/unicode/resbund.h \
    ./usr/include/arm-linux-gnueabihf/unicode/schriter.h \
    ./usr/include/arm-linux-gnueabihf/unicode/search.h \
    ./usr/include/arm-linux-gnueabihf/unicode/selfmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/simpletz.h \
    ./usr/include/arm-linux-gnueabihf/unicode/smpdtfmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/sortkey.h \
    ./usr/include/arm-linux-gnueabihf/unicode/std_string.h \
    ./usr/include/arm-linux-gnueabihf/unicode/strenum.h \
    ./usr/include/arm-linux-gnueabihf/unicode/stringpiece.h \
    ./usr/include/arm-linux-gnueabihf/unicode/stringtriebuilder.h \
    ./usr/include/arm-linux-gnueabihf/unicode/stsearch.h \
    ./usr/include/arm-linux-gnueabihf/unicode/symtable.h \
    ./usr/include/arm-linux-gnueabihf/unicode/tblcoll.h \
    ./usr/include/arm-linux-gnueabihf/unicode/timezone.h \
    ./usr/include/arm-linux-gnueabihf/unicode/tmunit.h \
    ./usr/include/arm-linux-gnueabihf/unicode/tmutamt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/tmutfmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/translit.h \
    ./usr/include/arm-linux-gnueabihf/unicode/tzfmt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/tznames.h \
    ./usr/include/arm-linux-gnueabihf/unicode/tzrule.h \
    ./usr/include/arm-linux-gnueabihf/unicode/tztrans.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ubidi.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ubrk.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucal.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucasemap.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucat.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uchar.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucharstrie.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucharstriebuilder.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uchriter.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uclean.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucnv.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucnv_cb.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucnv_err.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucnvsel.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucol.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucoleitr.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uconfig.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucsdet.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ucurr.h \
    ./usr/include/arm-linux-gnueabihf/unicode/udat.h \
    ./usr/include/arm-linux-gnueabihf/unicode/udata.h \
    ./usr/include/arm-linux-gnueabihf/unicode/udateintervalformat.h \
    ./usr/include/arm-linux-gnueabihf/unicode/udatpg.h \
    ./usr/include/arm-linux-gnueabihf/unicode/udisplaycontext.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uenum.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uformattable.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ugender.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uidna.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uiter.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uldnames.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uloc.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ulocdata.h \
    ./usr/include/arm-linux-gnueabihf/unicode/umachine.h \
    ./usr/include/arm-linux-gnueabihf/unicode/umisc.h \
    ./usr/include/arm-linux-gnueabihf/unicode/umsg.h \
    ./usr/include/arm-linux-gnueabihf/unicode/unifilt.h \
    ./usr/include/arm-linux-gnueabihf/unicode/unifunct.h \
    ./usr/include/arm-linux-gnueabihf/unicode/unimatch.h \
    ./usr/include/arm-linux-gnueabihf/unicode/unirepl.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uniset.h \
    ./usr/include/arm-linux-gnueabihf/unicode/unistr.h \
    ./usr/include/arm-linux-gnueabihf/unicode/unorm.h \
    ./usr/include/arm-linux-gnueabihf/unicode/unorm2.h \
    ./usr/include/arm-linux-gnueabihf/unicode/unum.h \
    ./usr/include/arm-linux-gnueabihf/unicode/unumsys.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uobject.h \
    ./usr/include/arm-linux-gnueabihf/unicode/upluralrules.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uregex.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uregion.h \
    ./usr/include/arm-linux-gnueabihf/unicode/urename.h \
    ./usr/include/arm-linux-gnueabihf/unicode/urep.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ures.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uscript.h \
    ./usr/include/arm-linux-gnueabihf/unicode/usearch.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uset.h \
    ./usr/include/arm-linux-gnueabihf/unicode/usetiter.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ushape.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uspoof.h \
    ./usr/include/arm-linux-gnueabihf/unicode/usprep.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ustdio.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ustream.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ustring.h \
    ./usr/include/arm-linux-gnueabihf/unicode/ustringtrie.h \
    ./usr/include/arm-linux-gnueabihf/unicode/utext.h \
    ./usr/include/arm-linux-gnueabihf/unicode/utf.h \
    ./usr/include/arm-linux-gnueabihf/unicode/utf16.h \
    ./usr/include/arm-linux-gnueabihf/unicode/utf32.h \
    ./usr/include/arm-linux-gnueabihf/unicode/utf8.h \
    ./usr/include/arm-linux-gnueabihf/unicode/utf_old.h \
    ./usr/include/arm-linux-gnueabihf/unicode/utmscale.h \
    ./usr/include/arm-linux-gnueabihf/unicode/utrace.h \
    ./usr/include/arm-linux-gnueabihf/unicode/utrans.h \
    ./usr/include/arm-linux-gnueabihf/unicode/utypes.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uvernum.h \
    ./usr/include/arm-linux-gnueabihf/unicode/uversion.h \
    ./usr/include/arm-linux-gnueabihf/unicode/vtzone.h \
    ./usr/lib/arm-linux-gnueabihf/icu/52.1/Makefile.inc \
    ./usr/lib/arm-linux-gnueabihf/icu/52.1/pkgdata.inc \
    ./usr/lib/arm-linux-gnueabihf/icu/Makefile.inc \
    ./usr/lib/arm-linux-gnueabihf/icu/current \
    ./usr/lib/arm-linux-gnueabihf/icu/pkgdata.inc \
    ./usr/lib/arm-linux-gnueabihf/libicudata.a \
    ./usr/lib/arm-linux-gnueabihf/libicudata.so \
    ./usr/lib/arm-linux-gnueabihf/libicui18n.a \
    ./usr/lib/arm-linux-gnueabihf/libicui18n.so \
    ./usr/lib/arm-linux-gnueabihf/libicuio.a \
    ./usr/lib/arm-linux-gnueabihf/libicuio.so \
    ./usr/lib/arm-linux-gnueabihf/libicule.a \
    ./usr/lib/arm-linux-gnueabihf/libicule.so \
    ./usr/lib/arm-linux-gnueabihf/libiculx.a \
    ./usr/lib/arm-linux-gnueabihf/libiculx.so \
    ./usr/lib/arm-linux-gnueabihf/libicutest.a \
    ./usr/lib/arm-linux-gnueabihf/libicutest.so \
    ./usr/lib/arm-linux-gnueabihf/libicutu.a \
    ./usr/lib/arm-linux-gnueabihf/libicutu.so \
    ./usr/lib/arm-linux-gnueabihf/libicuuc.a \
    ./usr/lib/arm-linux-gnueabihf/libicuuc.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/icu-i18n.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/icu-io.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/icu-le.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/icu-lx.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/icu-uc.pc \
    ./usr/share/doc/libicu-dev/NEWS.Debian.gz \
    ./usr/share/doc/libicu-dev/changelog.Debian.gz \
    ./usr/share/doc/libicu-dev/copyright \
    ./usr/share/doc/libicu-dev/examples/Makefile \
    ./usr/share/doc/libicu-dev/examples/Makefile.in \
    ./usr/share/doc/libicu-dev/examples/all/all.sln \
    ./usr/share/doc/libicu-dev/examples/break/Makefile \
    ./usr/share/doc/libicu-dev/examples/break/break.cpp \
    ./usr/share/doc/libicu-dev/examples/break/break.sln \
    ./usr/share/doc/libicu-dev/examples/break/break.vcxproj \
    ./usr/share/doc/libicu-dev/examples/break/break.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/break/readme.txt \
    ./usr/share/doc/libicu-dev/examples/break/ubreak.c \
    ./usr/share/doc/libicu-dev/examples/cal/Makefile \
    ./usr/share/doc/libicu-dev/examples/cal/Makefile.in \
    ./usr/share/doc/libicu-dev/examples/cal/cal.c \
    ./usr/share/doc/libicu-dev/examples/cal/cal.sln \
    ./usr/share/doc/libicu-dev/examples/cal/cal.vcxproj \
    ./usr/share/doc/libicu-dev/examples/cal/cal.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/cal/readme.txt \
    ./usr/share/doc/libicu-dev/examples/cal/uprint.c \
    ./usr/share/doc/libicu-dev/examples/cal/uprint.h \
    ./usr/share/doc/libicu-dev/examples/case/Makefile \
    ./usr/share/doc/libicu-dev/examples/case/case.cpp \
    ./usr/share/doc/libicu-dev/examples/case/case.sln \
    ./usr/share/doc/libicu-dev/examples/case/case.vcxproj \
    ./usr/share/doc/libicu-dev/examples/case/case.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/case/readme.txt \
    ./usr/share/doc/libicu-dev/examples/case/ucase.c \
    ./usr/share/doc/libicu-dev/examples/citer/Makefile \
    ./usr/share/doc/libicu-dev/examples/citer/citer.cpp \
    ./usr/share/doc/libicu-dev/examples/citer/citer.vcxproj \
    ./usr/share/doc/libicu-dev/examples/citer/citer.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/citer/readme.txt \
    ./usr/share/doc/libicu-dev/examples/coll/Makefile \
    ./usr/share/doc/libicu-dev/examples/coll/coll.cpp \
    ./usr/share/doc/libicu-dev/examples/coll/coll.sln \
    ./usr/share/doc/libicu-dev/examples/coll/coll.vcxproj \
    ./usr/share/doc/libicu-dev/examples/coll/coll.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/coll/readme.txt \
    ./usr/share/doc/libicu-dev/examples/csdet/Makefile \
    ./usr/share/doc/libicu-dev/examples/csdet/csdet.c \
    ./usr/share/doc/libicu-dev/examples/csdet/csdet.vcxproj \
    ./usr/share/doc/libicu-dev/examples/csdet/csdet.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/csdet/readme.txt \
    ./usr/share/doc/libicu-dev/examples/date/Makefile \
    ./usr/share/doc/libicu-dev/examples/date/Makefile.in \
    ./usr/share/doc/libicu-dev/examples/date/date.c \
    ./usr/share/doc/libicu-dev/examples/date/date.sln \
    ./usr/share/doc/libicu-dev/examples/date/date.vcxproj \
    ./usr/share/doc/libicu-dev/examples/date/date.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/date/readme.txt \
    ./usr/share/doc/libicu-dev/examples/date/uprint.c \
    ./usr/share/doc/libicu-dev/examples/date/uprint.h \
    ./usr/share/doc/libicu-dev/examples/datecal/Makefile \
    ./usr/share/doc/libicu-dev/examples/datecal/cal.cpp \
    ./usr/share/doc/libicu-dev/examples/datecal/ccal.c \
    ./usr/share/doc/libicu-dev/examples/datefmt/Makefile \
    ./usr/share/doc/libicu-dev/examples/datefmt/README.TXT \
    ./usr/share/doc/libicu-dev/examples/datefmt/answers/main_0.cpp \
    ./usr/share/doc/libicu-dev/examples/datefmt/answers/main_1.cpp \
    ./usr/share/doc/libicu-dev/examples/datefmt/answers/main_2.cpp \
    ./usr/share/doc/libicu-dev/examples/datefmt/answers/main_3.cpp \
    ./usr/share/doc/libicu-dev/examples/datefmt/datefmt.sln \
    ./usr/share/doc/libicu-dev/examples/datefmt/datefmt.vcxproj \
    ./usr/share/doc/libicu-dev/examples/datefmt/datefmt.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/datefmt/main.cpp \
    ./usr/share/doc/libicu-dev/examples/datefmt/util.cpp \
    ./usr/share/doc/libicu-dev/examples/datefmt/util.h \
    ./usr/share/doc/libicu-dev/examples/defs.mk \
    ./usr/share/doc/libicu-dev/examples/dtitvfmtsample/dtitvfmtsample.cpp \
    ./usr/share/doc/libicu-dev/examples/dtitvfmtsample/dtitvfmtsample.vcxproj \
    ./usr/share/doc/libicu-dev/examples/dtitvfmtsample/dtitvfmtsample.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/dtptngsample/dtptngsample.cpp \
    ./usr/share/doc/libicu-dev/examples/dtptngsample/dtptngsample.vcxproj \
    ./usr/share/doc/libicu-dev/examples/dtptngsample/dtptngsample.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/layout/FontMap.GDI \
    ./usr/share/doc/libicu-dev/examples/layout/FontMap.Gnome \
    ./usr/share/doc/libicu-dev/examples/layout/FontMap.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/FontMap.h \
    ./usr/share/doc/libicu-dev/examples/layout/FontTableCache.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/FontTableCache.h \
    ./usr/share/doc/libicu-dev/examples/layout/GDIFontInstance.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/GDIFontInstance.h \
    ./usr/share/doc/libicu-dev/examples/layout/GDIFontMap.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/GDIFontMap.h \
    ./usr/share/doc/libicu-dev/examples/layout/GDIGUISupport.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/GDIGUISupport.h \
    ./usr/share/doc/libicu-dev/examples/layout/GUISupport.h \
    ./usr/share/doc/libicu-dev/examples/layout/GnomeFontInstance.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/GnomeFontInstance.h \
    ./usr/share/doc/libicu-dev/examples/layout/GnomeFontMap.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/GnomeFontMap.h \
    ./usr/share/doc/libicu-dev/examples/layout/GnomeGUISupport.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/GnomeGUISupport.h \
    ./usr/share/doc/libicu-dev/examples/layout/LayoutSample.rc \
    ./usr/share/doc/libicu-dev/examples/layout/Makefile \
    ./usr/share/doc/libicu-dev/examples/layout/Makefile.in \
    ./usr/share/doc/libicu-dev/examples/layout/RenderingSurface.h \
    ./usr/share/doc/libicu-dev/examples/layout/Sample.txt \
    ./usr/share/doc/libicu-dev/examples/layout/ScriptCompositeFontInstance.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/ScriptCompositeFontInstance.h \
    ./usr/share/doc/libicu-dev/examples/layout/Surface.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/Surface.h \
    ./usr/share/doc/libicu-dev/examples/layout/UnicodeReader.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/UnicodeReader.h \
    ./usr/share/doc/libicu-dev/examples/layout/arraymem.h \
    ./usr/share/doc/libicu-dev/examples/layout/cgnomelayout.c \
    ./usr/share/doc/libicu-dev/examples/layout/clayout.c \
    ./usr/share/doc/libicu-dev/examples/layout/cmaps.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/cmaps.h \
    ./usr/share/doc/libicu-dev/examples/layout/gdiglue.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/gdiglue.h \
    ./usr/share/doc/libicu-dev/examples/layout/gnomeglue.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/gnomeglue.h \
    ./usr/share/doc/libicu-dev/examples/layout/gnomelayout.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/gsupport.h \
    ./usr/share/doc/libicu-dev/examples/layout/layout.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/layout.sln \
    ./usr/share/doc/libicu-dev/examples/layout/layout.vcxproj \
    ./usr/share/doc/libicu-dev/examples/layout/layout.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/layout/paragraph.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/paragraph.h \
    ./usr/share/doc/libicu-dev/examples/layout/pflow.c \
    ./usr/share/doc/libicu-dev/examples/layout/pflow.h \
    ./usr/share/doc/libicu-dev/examples/layout/readme.html \
    ./usr/share/doc/libicu-dev/examples/layout/resource.h \
    ./usr/share/doc/libicu-dev/examples/layout/rsurface.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/rsurface.h \
    ./usr/share/doc/libicu-dev/examples/layout/sfnt.h \
    ./usr/share/doc/libicu-dev/examples/layout/ucreader.cpp \
    ./usr/share/doc/libicu-dev/examples/layout/ucreader.h \
    ./usr/share/doc/libicu-dev/examples/legacy/Makefile \
    ./usr/share/doc/libicu-dev/examples/legacy/README \
    ./usr/share/doc/libicu-dev/examples/legacy/legacy.cpp \
    ./usr/share/doc/libicu-dev/examples/legacy/legacy.sln \
    ./usr/share/doc/libicu-dev/examples/legacy/legacy.vcxproj \
    ./usr/share/doc/libicu-dev/examples/legacy/legacy.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/legacy/newcol.cpp \
    ./usr/share/doc/libicu-dev/examples/legacy/oldcol.cpp \
    ./usr/share/doc/libicu-dev/examples/msgfmt/Makefile \
    ./usr/share/doc/libicu-dev/examples/msgfmt/README.TXT \
    ./usr/share/doc/libicu-dev/examples/msgfmt/answers/main_0.cpp \
    ./usr/share/doc/libicu-dev/examples/msgfmt/answers/main_1.cpp \
    ./usr/share/doc/libicu-dev/examples/msgfmt/answers/main_2.cpp \
    ./usr/share/doc/libicu-dev/examples/msgfmt/answers/main_3.cpp \
    ./usr/share/doc/libicu-dev/examples/msgfmt/main.cpp \
    ./usr/share/doc/libicu-dev/examples/msgfmt/msgfmt.sln \
    ./usr/share/doc/libicu-dev/examples/msgfmt/msgfmt.vcxproj \
    ./usr/share/doc/libicu-dev/examples/msgfmt/msgfmt.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/msgfmt/util.cpp \
    ./usr/share/doc/libicu-dev/examples/msgfmt/util.h \
    ./usr/share/doc/libicu-dev/examples/numfmt/Makefile \
    ./usr/share/doc/libicu-dev/examples/numfmt/capi.c \
    ./usr/share/doc/libicu-dev/examples/numfmt/main.cpp \
    ./usr/share/doc/libicu-dev/examples/numfmt/numfmt.sln \
    ./usr/share/doc/libicu-dev/examples/numfmt/numfmt.vcxproj \
    ./usr/share/doc/libicu-dev/examples/numfmt/numfmt.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/numfmt/readme.txt \
    ./usr/share/doc/libicu-dev/examples/numfmt/util.cpp \
    ./usr/share/doc/libicu-dev/examples/numfmt/util.h \
    ./usr/share/doc/libicu-dev/examples/plurfmtsample/plurfmtsample.cpp \
    ./usr/share/doc/libicu-dev/examples/plurfmtsample/plurfmtsample.vcxproj \
    ./usr/share/doc/libicu-dev/examples/plurfmtsample/plurfmtsample.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/props/Makefile \
    ./usr/share/doc/libicu-dev/examples/props/props.cpp \
    ./usr/share/doc/libicu-dev/examples/props/props.sln \
    ./usr/share/doc/libicu-dev/examples/props/props.vcxproj \
    ./usr/share/doc/libicu-dev/examples/props/props.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/props/readme.txt \
    ./usr/share/doc/libicu-dev/examples/readme.txt \
    ./usr/share/doc/libicu-dev/examples/rules.mk \
    ./usr/share/doc/libicu-dev/examples/strsrch/Makefile \
    ./usr/share/doc/libicu-dev/examples/strsrch/readme.txt \
    ./usr/share/doc/libicu-dev/examples/strsrch/strsrch.cpp \
    ./usr/share/doc/libicu-dev/examples/strsrch/strsrch.sln \
    ./usr/share/doc/libicu-dev/examples/strsrch/strsrch.vcxproj \
    ./usr/share/doc/libicu-dev/examples/strsrch/strsrch.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/translit/Makefile \
    ./usr/share/doc/libicu-dev/examples/translit/README.TXT \
    ./usr/share/doc/libicu-dev/examples/translit/answers/main_1.cpp \
    ./usr/share/doc/libicu-dev/examples/translit/answers/main_2.cpp \
    ./usr/share/doc/libicu-dev/examples/translit/answers/main_3.cpp \
    ./usr/share/doc/libicu-dev/examples/translit/answers/main_4.cpp \
    ./usr/share/doc/libicu-dev/examples/translit/answers/unaccent.cpp \
    ./usr/share/doc/libicu-dev/examples/translit/answers/unaccent.h \
    ./usr/share/doc/libicu-dev/examples/translit/main.cpp \
    ./usr/share/doc/libicu-dev/examples/translit/translit.sln \
    ./usr/share/doc/libicu-dev/examples/translit/translit.vcxproj \
    ./usr/share/doc/libicu-dev/examples/translit/translit.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/translit/unaccent.cpp \
    ./usr/share/doc/libicu-dev/examples/translit/unaccent.h \
    ./usr/share/doc/libicu-dev/examples/translit/util.cpp \
    ./usr/share/doc/libicu-dev/examples/translit/util.h \
    ./usr/share/doc/libicu-dev/examples/uciter8/Makefile \
    ./usr/share/doc/libicu-dev/examples/uciter8/readme.txt \
    ./usr/share/doc/libicu-dev/examples/uciter8/uciter8.c \
    ./usr/share/doc/libicu-dev/examples/uciter8/uciter8.sln \
    ./usr/share/doc/libicu-dev/examples/uciter8/uciter8.vcxproj \
    ./usr/share/doc/libicu-dev/examples/uciter8/uciter8.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/uciter8/uit_len8.c \
    ./usr/share/doc/libicu-dev/examples/uciter8/uit_len8.h \
    ./usr/share/doc/libicu-dev/examples/ucnv/Makefile \
    ./usr/share/doc/libicu-dev/examples/ucnv/convsamp.cpp \
    ./usr/share/doc/libicu-dev/examples/ucnv/data01.txt \
    ./usr/share/doc/libicu-dev/examples/ucnv/data02.bin \
    ./usr/share/doc/libicu-dev/examples/ucnv/data06.txt \
    ./usr/share/doc/libicu-dev/examples/ucnv/flagcb.c \
    ./usr/share/doc/libicu-dev/examples/ucnv/flagcb.h \
    ./usr/share/doc/libicu-dev/examples/ucnv/readme.txt \
    ./usr/share/doc/libicu-dev/examples/ucnv/ucnv.sln \
    ./usr/share/doc/libicu-dev/examples/ucnv/ucnv.vcxproj \
    ./usr/share/doc/libicu-dev/examples/ucnv/ucnv.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/udata/Makefile \
    ./usr/share/doc/libicu-dev/examples/udata/reader.c \
    ./usr/share/doc/libicu-dev/examples/udata/reader.vcxproj \
    ./usr/share/doc/libicu-dev/examples/udata/reader.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/udata/readme.txt \
    ./usr/share/doc/libicu-dev/examples/udata/udata.sln \
    ./usr/share/doc/libicu-dev/examples/udata/writer.c \
    ./usr/share/doc/libicu-dev/examples/udata/writer.vcxproj \
    ./usr/share/doc/libicu-dev/examples/udata/writer.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/ufortune/Makefile \
    ./usr/share/doc/libicu-dev/examples/ufortune/fortunedefs.mk \
    ./usr/share/doc/libicu-dev/examples/ufortune/readme.txt \
    ./usr/share/doc/libicu-dev/examples/ufortune/resources/Makefile \
    ./usr/share/doc/libicu-dev/examples/ufortune/resources/es.txt \
    ./usr/share/doc/libicu-dev/examples/ufortune/resources/fortune_resources.mak \
    ./usr/share/doc/libicu-dev/examples/ufortune/resources/res-file-list.txt \
    ./usr/share/doc/libicu-dev/examples/ufortune/resources/root.txt \
    ./usr/share/doc/libicu-dev/examples/ufortune/ufortune.c \
    ./usr/share/doc/libicu-dev/examples/ufortune/ufortune.sln \
    ./usr/share/doc/libicu-dev/examples/ufortune/ufortune.vcxproj \
    ./usr/share/doc/libicu-dev/examples/ufortune/ufortune.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/ugrep/Makefile \
    ./usr/share/doc/libicu-dev/examples/ugrep/readme.txt \
    ./usr/share/doc/libicu-dev/examples/ugrep/ugrep.cpp \
    ./usr/share/doc/libicu-dev/examples/ugrep/ugrep.sln \
    ./usr/share/doc/libicu-dev/examples/ugrep/ugrep.vcxproj \
    ./usr/share/doc/libicu-dev/examples/ugrep/ugrep.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/uresb/Makefile \
    ./usr/share/doc/libicu-dev/examples/uresb/en.txt \
    ./usr/share/doc/libicu-dev/examples/uresb/readme.txt \
    ./usr/share/doc/libicu-dev/examples/uresb/resources.mak \
    ./usr/share/doc/libicu-dev/examples/uresb/resources.vcxproj \
    ./usr/share/doc/libicu-dev/examples/uresb/resources.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/uresb/root.txt \
    ./usr/share/doc/libicu-dev/examples/uresb/sr.txt \
    ./usr/share/doc/libicu-dev/examples/uresb/uresb.c \
    ./usr/share/doc/libicu-dev/examples/uresb/uresb.sln \
    ./usr/share/doc/libicu-dev/examples/uresb/uresb.vcxproj \
    ./usr/share/doc/libicu-dev/examples/uresb/uresb.vcxproj.filters \
    ./usr/share/doc/libicu-dev/examples/ustring/Makefile \
    ./usr/share/doc/libicu-dev/examples/ustring/readme.txt \
    ./usr/share/doc/libicu-dev/examples/ustring/ustring.cpp \
    ./usr/share/doc/libicu-dev/examples/ustring/ustring.sln \
    ./usr/share/doc/libicu-dev/examples/ustring/ustring.vcxproj \
    ./usr/share/doc/libicu-dev/examples/ustring/ustring.vcxproj.filters \
    ./usr/share/icu/52.1/config/mh-linux \
    ./usr/share/icu/52.1/install-sh \
    ./usr/share/icu/52.1/license.html \
    ./usr/share/icu/52.1/mkinstalldirs\
"
FILES_libicu52 = " \
    ./usr/lib/arm-linux-gnueabihf/libicudata.so.52 \
    ./usr/lib/arm-linux-gnueabihf/libicudata.so.52.1 \
    ./usr/lib/arm-linux-gnueabihf/libicui18n.so.52 \
    ./usr/lib/arm-linux-gnueabihf/libicui18n.so.52.1 \
    ./usr/lib/arm-linux-gnueabihf/libicuio.so.52 \
    ./usr/lib/arm-linux-gnueabihf/libicuio.so.52.1 \
    ./usr/lib/arm-linux-gnueabihf/libicule.so.52 \
    ./usr/lib/arm-linux-gnueabihf/libicule.so.52.1 \
    ./usr/lib/arm-linux-gnueabihf/libiculx.so.52 \
    ./usr/lib/arm-linux-gnueabihf/libiculx.so.52.1 \
    ./usr/lib/arm-linux-gnueabihf/libicutest.so.52 \
    ./usr/lib/arm-linux-gnueabihf/libicutest.so.52.1 \
    ./usr/lib/arm-linux-gnueabihf/libicutu.so.52 \
    ./usr/lib/arm-linux-gnueabihf/libicutu.so.52.1 \
    ./usr/lib/arm-linux-gnueabihf/libicuuc.so.52 \
    ./usr/lib/arm-linux-gnueabihf/libicuuc.so.52.1 \
    ./usr/share/doc/libicu52/NEWS.Debian.gz \
    ./usr/share/doc/libicu52/changelog.Debian.gz \
    ./usr/share/doc/libicu52/copyright \
    ./usr/share/lintian/overrides/libicu52\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
